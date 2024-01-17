import { Component } from '@angular/core';
import { Student } from '../Entities/student';
import { StudentService } from '../Services/student.service';

@Component({
  selector: 'app-register-list',
  templateUrl: './register-list.component.html',
  styleUrls: ['./register-list.component.css']
})
export class RegisterListComponent {


  students!: Student[];

  constructor(private studentService: StudentService) {
  }

  ngOnInit() {
    this.studentService.findAll().subscribe(data => {
      this.students = data;
    });
  }
}