package com.akveo.bundlejava.search;

import com.akveo.bundlejava.index.Resume;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

public interface ISearch {
    public List<Resume> findAll();
    public List<Resume> findByAuthor(String author);
    public List<Resume> findByTitle(String title);
    public List<Resume> findByContent(String content);
    public Page<Resume> findByDateRange(String start, String end);
    public List<Resume> findByExtension(String extension);


}
