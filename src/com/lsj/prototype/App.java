package com.lsj.prototype;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException{
        GithubRepository repository = new GithubRepository();
        repository.setUser("tmdwns1101");
        repository.setName("DemoRepository");

        GithubIssue issue = new GithubIssue(repository);
        issue.setId(1);
        issue.setTitle("이슈가 등록 되었습니다");

        System.out.println(issue);
        GithubIssue clonedIssue = (GithubIssue) issue.clone();


        System.out.println(clonedIssue != issue);
        System.out.println(issue.equals(clonedIssue));
        System.out.println(issue.getClass() == clonedIssue.getClass());

        System.out.println(clonedIssue.getUrl());
        System.out.println(clonedIssue);

    }
}
