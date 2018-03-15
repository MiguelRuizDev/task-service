package org.activiti.incubator.taskservice;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;

    //private Date creationDate;
    //private Date dueDate;

    private String assignedUser; //just to test
    private int priority; //from 1 down to 10 (DESC)

    private long  parent; //stores parent's id; if there is no parent, id = -1
    //private long[] children; //stores children's id; probably a different collection in the future

    //private String url; //we'll get that with HAL

    //private String attachments;

    private String content; //meant to be a JSON file

    //constructors

    public Task(){
    }

    public Task(String title, int priority, String content) {
        this.title = title;
        this.priority = priority;;
        this.content = content;
    }


        //more constructors on their way...


    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
/*
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
*/
    public String getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(String assignedUser) {
        this.assignedUser = assignedUser;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public long getParent() {
        return parent;
    }

    public void setParent(long parent) {
        this.parent = parent;
    }
    /*
        public long[] getChildren() {
            return children;
        }

        public void setChildren(long[] children) {
            this.children = children;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAttachments() {
            return attachments;
        }

        public void setAttachments(String attachments) {
            this.attachments = attachments;
        }

    */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
