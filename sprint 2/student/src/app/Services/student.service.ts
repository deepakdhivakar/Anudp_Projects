import { Injectable } from '@angular/core';
import { Student } from '../Entities/student';
import { Observable } from 'rxjs/internal/Observable';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StudentService  {

  private usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8086/post';
  }
  findAll(): Observable<any> {
    console.log(Student)
    return this.http.get('http://localhost:8086/student');
  }

  public save(student: Student) {
    return this.http.post<Student>(this.usersUrl, student);
  }}
