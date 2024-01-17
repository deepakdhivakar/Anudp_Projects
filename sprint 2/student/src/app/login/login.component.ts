import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { StudentService } from '../Services/student.service';
import { Student } from '../Entities/student';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  student:Student=new Student();


  constructor(private studentService:StudentService){

  }

  ngOnInit():void{

  }
  Login(){
    console.log(this.student)
    this.studentService.save(this.student).subscribe(data=>{
      alert("Login Sucessfully")
      
    }
    )
  }
}