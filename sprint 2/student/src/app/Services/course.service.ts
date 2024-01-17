import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Course } from '../Entities/course';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  addEmpURL : string;
  getEmpURL : string;
  updateEmpUrl : string;
  deleteEmpUrl : string;

  constructor(private http : HttpClient) {

    this.addEmpURL = 'http://localhost:8086/postcourse';
    this.getEmpURL = 'http://localhost:8086/course';
    this.updateEmpUrl = 'http://localhost:8086/updatecourse';
    this.deleteEmpUrl = 'http://localhost:8086/deletecourse';

   }

   addCourse(course : Course): Observable<Course> {
     return this.http.post<Course>(this.addEmpURL,course);
   }

   getAllCourse(): Observable<Course[]>{
     return this.http.get<Course[]>(this.getEmpURL);
   }

   updateCourse(course :Course) : Observable<Course>{
     return this.http.put<Course>(this.updateEmpUrl, course);
   }

   deleteCourse(course : Course) : Observable<Course> {
     return this.http.delete<Course>(this.deleteEmpUrl+'/'+course.courseId);
   }
  

}