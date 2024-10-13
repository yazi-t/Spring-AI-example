import { Component, ElementRef, ViewChild } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatButton } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { ImageGenerateService } from '../service/image.gen.service';

@Component({
  selector: 'app-image-gen-main',
  standalone: true,
  imports: [MatButton, MatInputModule, CommonModule],
  templateUrl: './image-gen-main.component.html',
  styleUrl: './image-gen-main.component.css'
})
export class ImageGenMainComponent {

  imageUrlToRender: string = 'https://upload.wikimedia.org/wikipedia/commons/1/14/No_Image_Available.jpg';

  @ViewChild('inputPrompt') inputPrompt!: ElementRef;

  constructor(private imgGenService: ImageGenerateService) { }


  onGenerate(): void {
    const prompt = this.inputPrompt.nativeElement.value;

    this.imgGenService.generate(prompt).subscribe(imageLoc => {
      this.imageUrlToRender = imageLoc;
    });
  }

}
