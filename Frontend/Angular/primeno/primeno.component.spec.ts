import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrimenoComponent } from './primeno.component';

describe('PrimenoComponent', () => {
  let component: PrimenoComponent;
  let fixture: ComponentFixture<PrimenoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PrimenoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PrimenoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
