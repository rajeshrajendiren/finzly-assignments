import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-primeno',
  templateUrl: './primeno.component.html',
  styleUrls: ['./primeno.component.css']
})
export class PrimenoComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  result="";
  c=0;
  onPrimeChecker(n:any){
    for(let i=2;i<=n;i++){
      if(n%i==0)
this.c=+1
    }
if(this.c==1){
  this.result="prime"
  return this.result;
}
else{
  this.result="not prime"
  return this.result;
}
  
  }}
