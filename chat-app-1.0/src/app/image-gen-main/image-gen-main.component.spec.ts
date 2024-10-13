import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImageGenMainComponent } from './image-gen-main.component';

describe('ImageGenMainComponent', () => {
  let component: ImageGenMainComponent;
  let fixture: ComponentFixture<ImageGenMainComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ImageGenMainComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ImageGenMainComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
