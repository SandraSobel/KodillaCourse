package com.kodilla.stream.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {
    @Test
    void testAddTaskList() {
        //given
        Board project = prepareTestData();
        //when
        //then
        assertEquals(3, project.getTaskLists().size());
    }

    private Board prepareTestData() {
        //users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Kondrad Bridge");
        //tasks
        Task task1 = new Task("Microservice for temp", "Write and test microservice taking the temp from external service",
                user1, user2, LocalDate.now().minusDays(20), LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis", "Prepare some HQL queries for analysis",
                user1, user2, LocalDate.now().minusDays(20), LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity", "Prepare entity for temperatures",
                user3, user2, LocalDate.now().minusDays(20), LocalDate.now().plusDays(15));
        Task task4 = new Task("Own Logger", "Refactor company logger to meet our needs",
                user3, user2, LocalDate.now().minusDays(10), LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching", "Archive data searching has to be optimized",
                user4, user2, LocalDate.now(), LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams", "use streams rather than for-loops in predictions",
                user4, user2, LocalDate.now().minusDays(15), LocalDate.now().minusDays(2));
        //taskList
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);

        //board
        Board project = new Board("Project weather prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);
        return project;
    }

    @Test
    void testAddTaskLimitFindUsersTasks() {
        //giver
        Board project = prepareTestData();
        //when
        User user = new User("developer1", "John Smith");
        List<Task> tasks = project.getTaskLists().stream().
                flatMap(taskList -> taskList.getTasks().stream())
                .filter(task -> task.getAssignedUser().equals(user))
                .collect(Collectors.toList());
        //then
        assertEquals(2, tasks.size());
        assertEquals(user, tasks.get(0).getAssignedUser());
        assertEquals(user, tasks.get(1).getAssignedUser());
    }

    @Test
    void testAddTaskListFindOutDatedTasks() {
        //given
        Board project = prepareTestData();
        //when
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(task -> task.getTasks().stream())
                .filter(task -> task.getDeadline().isBefore(LocalDate.now()))
                .collect(Collectors.toList());
        //then
        Assertions.assertEquals(1, tasks.size());
        Assertions.assertEquals("HQLs for analysis", tasks.get(0).getTitle());

    }
    @Test
    void testAddTaskListFindLongTask(){
        //given
        Board project = prepareTestData();
        //when
        List<TaskList> inProgressTask = new ArrayList<>();
        inProgressTask.add(new TaskList("In progress"));
        long longTask = project.getTaskLists().stream()
                .filter(inProgressTask::contains)
                .flatMap(tl->tl.getTasks().stream())
                .map(Task::getCreated)
                .filter(d->d.compareTo(LocalDate.now().minusDays(10))<=0)
                .count();
        //then
        assertEquals(2,longTask);
    }
    @Test
    void testAddTaskListAverageWorkingOnTask() {
        //given
        Board project = prepareTestData();
        List<TaskList> inProgressTask = new ArrayList<>();
        inProgressTask.add(new TaskList("In progress"));

        //when
        long daysSum = project.getTaskLists().stream()
                .filter(inProgressTask::contains)
                .flatMap(taskList -> taskList.getTasks().stream())
                .map(task -> ChronoUnit.DAYS.between(task.getCreated(), task.getDeadline()))
                .reduce(0L, (sum, current) -> sum = sum += current);


        long taskQuantity = project.getTaskLists().stream()
                .filter(inProgressTask::contains)
                .flatMap(taskList -> taskList.getTasks().stream())
                .map(task -> ChronoUnit.DAYS.between(task.getCreated(), task.getDeadline()))
                .count();


        long averageWorkingOnTask = daysSum / taskQuantity;

        //then
        long averageDays = (5L+35L+15L)/3;
        assertEquals(averageDays,averageWorkingOnTask);
    }



}



