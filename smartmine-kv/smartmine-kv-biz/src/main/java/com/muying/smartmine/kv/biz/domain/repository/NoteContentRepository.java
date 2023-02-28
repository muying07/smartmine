package com.muying.smartmine.kv.biz.domain.repository;

import com.muying.smartmine.kv.biz.domain.entity.NoteContent;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface NoteContentRepository extends CassandraRepository<NoteContent, UUID> {

}
