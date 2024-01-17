import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { CourseComponent } from './course/course.component';
import { CourseListComponent } from './course-list/course-list.component';
import { RegisterComponent } from './register/register.component';
import { RegisterListComponent } from './register-list/register-list.component';

const routes: Routes = [
  {path:"",pathMatch:'full',redirectTo:'home'},
  {path:'login',component:LoginComponent},
  
  {path:'register',component:RegisterComponent},
  {path:'home',component:HomeComponent},
  {path:'course',component:CourseComponent},
  {path:'course-list',component:CourseListComponent},
  
  {path:'register-list',component:RegisterListComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
