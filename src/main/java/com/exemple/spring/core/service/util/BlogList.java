package com.exemple.spring.core.service.util;

import java.util.ArrayList;
import java.util.List;

import com.exemple.spring.core.model.Blog;

public class BlogList {

    private List<Blog> blogs = new ArrayList<Blog>();

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
