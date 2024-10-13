import { Routes } from '@angular/router';
import { ChatMainComponent } from './chat-main/chat-main.component';
import { ImageGenMainComponent } from './image-gen-main/image-gen-main.component';

export const routes: Routes = [
    {path: 'chat', component: ChatMainComponent},
    {path: 'image-gen', component: ImageGenMainComponent}
];
