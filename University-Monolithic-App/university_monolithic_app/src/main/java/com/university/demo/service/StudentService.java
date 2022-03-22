package com.university.demo.service;

import com.university.demo.entity.Address;
import com.university.demo.entity.Student;
import com.university.demo.repository.AddressRepository;
import com.university.demo.repository.StudentRepository;
import com.university.demo.request.CreateStudentRequest;
import com.university.demo.response.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    AddressRepository addressRepository;

    public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {

        Address address = new Address();
        address.setStreet(createStudentRequest.getStreet());
        address.setCity(createStudentRequest.getCity());

        address = addressRepository.save(address);

        Student student = new Student();
        student.setFirstName(createStudentRequest.getFirstName());
        student.setLastName(createStudentRequest.getLastName());
        student.setEmail(createStudentRequest.getEmail());

        student.setAddress(address);
        student = studentRepository.save(student);

        return new StudentResponse(student);
    }

    public StudentResponse getById (long id) {
        return new StudentResponse(studentRepository.findById(id).get());
    }
}
