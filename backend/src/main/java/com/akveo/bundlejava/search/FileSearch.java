package com.akveo.bundlejava.search;

import com.akveo.bundlejava.index.File;
import com.akveo.bundlejava.index.Resume;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FileSearch extends ElasticsearchRepository<Resume,String> {
    @Query("{\"bool\": {\"must\": [{\"match_all\": {}}]}}")
    public List<Resume> getAll();

    List<Resume> findByContent(String content);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"meta.author\": \"?0\"}}]}}")
    List<Resume> findByAuthor(String author);


    @Query("{\"bool\": {\"must\": [{\"match\": {\"meta.title\": \"?0\"}}]}}")
    List<Resume> findByTitle(String title);

//    @Query("{\"bool\": {\"must\": {\"range\": {\"meta.date\": {\"gte\": \"?0\", \"lte\": \"?1\" }}}}")
//    List<Resume> findByDateRange(String start, String end);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"file.extension\": \"?0\"}}]}}")
    public List<Resume> findByExtension(String extension);


}
