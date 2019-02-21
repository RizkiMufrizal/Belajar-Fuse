package org.rizki.mufrizal.belajar.fuse.entity;

import java.util.Date;

/**
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Web <https://RizkiMufrizal.github.io>
 * @Since 21 February 2019
 * @Time 16:22
 * @Project belajar-fuse
 * @Package org.rizki.mufrizal.belajar.fuse.entity
 * @File Post
 */
public class Post {
    private int id;
    private String title;
    private String content;
    private Date publishedDate;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
}
