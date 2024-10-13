import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { text } from "stream/consumers";

export const IMG_GEN_URL: string = 'http://localhost:8080/image/generate';

@Injectable({
    providedIn: 'root'
})
export class ImageGenerateService {

    constructor(private http: HttpClient) { }

    public generate(prompt: string): Observable<string> {
        const headers = new HttpHeaders({
            'Content-Type': 'application/json'
          });
        return this.http.post(IMG_GEN_URL, prompt, {
            headers,
             responseType: 'text'
          });
    }
}