import { Component } from '@angular/core';
import { Student } from '../Entities/student';
import { StudentService } from '../Services/student.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  student:Student=new Student();


  constructor(private studentService:StudentService){

  }

  ngOnInit():void{

  }
  Login(){
    console.log(this.student)
    this.studentService.save(this.student).subscribe(data=>{
      alert("Login Sucessfully")
      
    },error=>alert("Sorry please enter correct Email and Password")
    )
  }
}
