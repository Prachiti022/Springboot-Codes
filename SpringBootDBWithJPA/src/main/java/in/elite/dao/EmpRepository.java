package in.elite.dao;

import org.springframework.stereotype.Repository;
import in.elite.entity.Emp;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface EmpRepository extends CrudRepository<Emp, Integer> {
    Emp findById(int id);
}