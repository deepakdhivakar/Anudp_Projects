import { Component } from '@angular/core';
import { CourseService } from '../Services/course.service';
import { Course } from '../Entities/course';

@Component({
  selector: 'app-user-edit',
  templateUrl: './user-edit.component.html',
  styleUrls: ['./user-edit.component.css']
})
export class UserEditComponent {


  

  course:Course=new Course();


  constructor(private courseService:CourseService){

  }

  ngOnInit():void{

  }
  courses(){
    console.log(this.course)
    this.courseService.addCourse(this.course).subscribe((data: any)=>{
      alert("Register  Sucessfully")
      
    }
    )

}
}
