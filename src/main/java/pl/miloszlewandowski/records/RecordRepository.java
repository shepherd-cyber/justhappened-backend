package pl.miloszlewandowski.records;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.miloszlewandowski.records.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {
//    Page<Record> getAllByPatient(Pageable pageable);
}