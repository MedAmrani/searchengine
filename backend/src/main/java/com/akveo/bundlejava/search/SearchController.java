package com.akveo.bundlejava.search;

import com.akveo.bundlejava.index.Resume;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin("*")
public class SearchController {
    @Autowired
    public ISearch service;

    @RequestMapping(value = "/api/search", method = RequestMethod.GET)
    public List<Resume> getAll() {
        return service.findAll();
    }


    @RequestMapping(value = "/api/search/author", method = RequestMethod.POST)
    public List<Resume> findByAuthor(@RequestParam String author) {
        System.out.print(author);
        return service.findByAuthor(author);

    }

    @RequestMapping(value = "/api/search/title", method = RequestMethod.POST)
    public List<Resume> findByTitle(@RequestParam String title) {
        System.out.print(title);
        return service.findByTitle(title);

    }


    @RequestMapping(value = "/api/search/content", method = RequestMethod.POST)
    public List<Resume> findByContent(@RequestParam String content) {
        return service.findByContent(content);

    }

    @RequestMapping(value = "/api/search/dateRange", method = RequestMethod.POST)
    public List<Resume> findByDateRange(@RequestParam(value = "start")  String start,
                                        @RequestParam(value = "end")  String end) {
        System.out.println(start+end);
        return service.findByDateRange(start, end).getContent();

    }

    @RequestMapping(value = "/api/search/extension", method = RequestMethod.POST)
    public List<Resume> findByExtension(@RequestParam  String extension) {

        return service.findByExtension(extension);

    }




}
