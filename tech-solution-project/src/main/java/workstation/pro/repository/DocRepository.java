package workstation.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import workstation.pro.model.Doc;

@Repository
public interface DocRepository extends JpaRepository<Doc,Long>{

}
