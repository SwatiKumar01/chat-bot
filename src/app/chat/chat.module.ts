import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ChatDialogComponent } from './chat-dialog/chat-dialog.component';
import { ChatService } from './chat.service';
import { WeatherClient } from './WeatherClient';
import { forecast } from './forecast';
import { WeatherTemperatureClient } from './WeatherTemperatureClient';
import { FormsModule } from '@angular/forms';
import { Zip} from './Zip'

@NgModule({
  imports: [
    CommonModule,
    FormsModule
  ],
  declarations: [
    ChatDialogComponent
  ],
  exports: [ ChatDialogComponent ],
  providers: [ChatService, WeatherClient, WeatherTemperatureClient, forecast, Zip]
})
export class ChatModule { }
