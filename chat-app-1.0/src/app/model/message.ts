export class Message {
    _id: number;
    _message: string;
    _order: number;
    _messageType: MessageType;

    constructor (id: number, message: string, order: number, messageType: MessageType) {
        this._id = id;
        this._message = message;
        this._order = order;
        this._messageType = messageType;
    }

    public isLeft(): boolean {
        return this._messageType === MessageType.SYSTEM;
    }

    public isRight(): boolean {
        return this._messageType === MessageType.MINE;
    }

    public id(): number {
        return this._id;
    }

    public message(): string {
        return this._message;
    }
}

export enum MessageType {
    MINE,
    SYSTEM
} 