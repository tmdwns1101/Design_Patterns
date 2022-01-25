package com.lsj.prototype;

import java.util.Objects;

public class GithubIssue implements Cloneable{

    private int id;

    private String title;

    private GithubRepository githubRepository;

    public GithubIssue(GithubRepository githubRepository) {
        this.githubRepository = githubRepository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                githubRepository.getUser(),
                githubRepository.getName(),
                id);
    }

    public GithubRepository getGithubRepository() {
        return githubRepository;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //deep copy
        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setUser(this.githubRepository.getUser());
        githubRepository.setName(this.githubRepository.getName());

        GithubIssue githubIssue = new GithubIssue(githubRepository);
        githubIssue.setTitle(title);
        githubIssue.setId(id);
        return githubIssue;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        GithubIssue that = (GithubIssue) obj;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(githubRepository, that.githubRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, getGithubRepository());
    }

    @Override
    public String toString() {
        return "GithubIssue{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", githubRepository=" + githubRepository +
                '}';
    }
}
