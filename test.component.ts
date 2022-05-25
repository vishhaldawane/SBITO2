import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  onClickSubmit(result:any) {
    console.log('username '+result.username);
    console.log('password '+result.password);
    console.log('age  '+result.age);
    console.log('address '+result.address);
  }
}
