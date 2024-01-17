import { Component } from '@angular/core';
import { Student } from '../Entities/student';
import { StudentService } from '../Services/student.service';
import { Course } from '../Entities/course';
import { CourseService } from '../Services/course.service';

@Component({
  selector: 'app-course',
  templateUrl: './course.component.html',
  styleUrls: ['./course.component.css']
})
export class CourseComponent {
  

  course:Course=new Course();


  constructor(private courseService:CourseService){

  }

  ngOnInit():void{

  }
  courses(){
    console.log(this.course)
    this.courseService.addCourse(this.course).subscribe((data: any)=>{
      alert("Register Sucessfully")
      
    }
    )

}
}