package com.akveo.bundlejava.search;

import com.akveo.bundlejava.index.File;
import com.akveo.bundlejava.index.Resume;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
public interface FileSearch extends ElasticsearchRepository<Resume,String> {
}
