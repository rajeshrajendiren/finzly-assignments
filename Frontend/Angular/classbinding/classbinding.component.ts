import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-classbinding',
  templateUrl: './classbinding.component.html',
  styleUrls: ['./classbinding.component.css']
})
export class ClassbindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  isItalic = false;
  isColored = false;

  applyStyles() {
    this.isItalic = !this.isItalic;
    this.isColored = !this.isColored;
  }

}
