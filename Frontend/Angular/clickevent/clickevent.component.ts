import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-clickevent',
  templateUrl: './clickevent.component.html',
  styleUrls: ['./clickevent.component.css']
})
export class ClickeventComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  onSend(s:any){
    console.log("recieved"+s)
  }

}
