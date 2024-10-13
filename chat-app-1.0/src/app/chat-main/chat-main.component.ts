import { Component, ViewChild, OnInit, ElementRef } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatButton } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input'
import {MatGridListModule} from '@angular/material/grid-list';
import { Message, MessageType } from '../model/message';
import { ChatService } from '../service/chat.service'

@Component({
  selector: 'app-chat-main',
  standalone: true,
  imports: [MatButton, MatInputModule, MatGridListModule, CommonModule],
  templateUrl: './chat-main.component.html',
  styleUrl: './chat-main.component.css'
})
export class ChatMainComponent implements OnInit {

  @ViewChild('chatMessage') inputChatMsg!: ElementRef;
  
  messages: Message[] = [];

  constructor(private chatService: ChatService) {

  }
  
  ngOnInit(): void {
   // throw new Error('Method not implemented.');
  }

  onSend(): void {
    const text = this.inputChatMsg.nativeElement.value;
    console.log('Sending message: ' + text);
    this.inputChatMsg.nativeElement.value = '';

    const myMessage = new Message(1, text, 0, MessageType.MINE);
    this.messages.push(myMessage);

    this.chatService.chat(text).subscribe(theirMessage => {
      this.messages.push(theirMessage);
    });
  }
}
