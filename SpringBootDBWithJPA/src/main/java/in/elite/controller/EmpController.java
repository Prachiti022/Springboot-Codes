package in.elite.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import in.elite.entity.Emp;
import in.elite.service.EmpService;

@RestController
@RequestMapping("/api/Emp")
public class EmpController {

    @Autowired
    private EmpService empService;
    
    public EmpController(EmpService empService) {
		this.empService = empService;
	}

	@GetMapping("/emp")
    public ResponseEntity<List<Emp>> getEmp() {
        List<Emp> list = empService.getAllEmp();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }

    @GetMapping("/emp/{id}")
    public ResponseEntity<Emp> getEmp(@PathVariable("id") int id) {
        Emp emp = empService.getEmpById(id);
        if (emp == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(emp));
    }

    @PostMapping("/emp")
    public Emp addEmp(@RequestBody Emp emp) {
        this.empService.addEmp(emp);
        return emp;
    }

    @PutMapping("/emp/{id}")
    public Emp updateEmp(@RequestBody Emp emp, @PathVariable("id") int empId) {
        this.empService.updateEmp(emp, empId);
        return emp;
    }

    @DeleteMapping("/emp/{id}")
    public void deleteEmp(@PathVariable("id") int empId) {
        this.empService.deleteEmp(empId);
    }
}
