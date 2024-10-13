import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Message, MessageType } from '../model/message';
import { MessageIn } from '../dto/message.in';

const CHAT_URL: string = 'http://localhost:8080/chat'

@Injectable({
    providedIn: 'root'
})
export class ChatService {

    constructor(private http: HttpClient) { }

    public chat(input: string): Observable<Message> {
        return this.http.post<any>(CHAT_URL, new MessageIn(input)).pipe(map(reply => {
            const message: Message = new Message(0, reply.reply, 0, MessageType.SYSTEM);
            return message;
        }));
    }
}