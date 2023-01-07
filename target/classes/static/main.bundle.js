webpackJsonp(["main"],{

/***/ "../../../../../src/$$_lazy_route_resource lazy recursive":
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncatched exception popping up in devtools
	return Promise.resolve().then(function() {
		throw new Error("Cannot find module '" + req + "'.");
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "../../../../../src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "../../../../../src/app/app.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, ".chatHeaderWrapper {\r\n    height: 0px;\r\n    color: #222;\r\n    box-shadow: 0 2px 3px rgba(0,0,0,0.37), 1px 2px 3px rgba(0,0,0,0.54);\r\n    z-index: 2;\r\n}\r\n\r\n.chatRoom {\r\n    height: 100%;\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -webkit-box-orient: vertical;\r\n    -webkit-box-direction: normal;\r\n        -ms-flex-direction: column;\r\n            flex-direction: column;\r\n}\r\n\r\nrouter-outlet {\r\n    height:0;\r\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/app.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"chatRoom\">\n  <router-outlet></router-outlet>\n</div>"

/***/ }),

/***/ "../../../../../src/app/app.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = (function () {
    function AppComponent() {
        this.title = 'BaseChat';
    }
    AppComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-root',
            template: __webpack_require__("../../../../../src/app/app.component.html"),
            styles: [__webpack_require__("../../../../../src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "../../../../../src/app/app.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__("../../../platform-browser/esm5/platform-browser.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_forms__ = __webpack_require__("../../../forms/esm5/forms.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__angular_common_http__ = __webpack_require__("../../../common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__angular_http__ = __webpack_require__("../../../http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6_angularfire2_database_deprecated__ = __webpack_require__("../../../../angularfire2/database-deprecated/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7_angularfire2__ = __webpack_require__("../../../../angularfire2/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8_angularfire2_auth__ = __webpack_require__("../../../../angularfire2/auth/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__app_component__ = __webpack_require__("../../../../../src/app/app.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__components_chat_form_chat_form_component__ = __webpack_require__("../../../../../src/app/components/chat-form/chat-form.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__components_chatroom_chatroom_component__ = __webpack_require__("../../../../../src/app/components/chatroom/chatroom.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__components_feed_feed_component__ = __webpack_require__("../../../../../src/app/components/feed/feed.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__components_message_message_component__ = __webpack_require__("../../../../../src/app/components/message/message.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__components_navbar_navbar_component__ = __webpack_require__("../../../../../src/app/components/navbar/navbar.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__services_chat_service__ = __webpack_require__("../../../../../src/app/services/chat.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16__services_auth_service__ = __webpack_require__("../../../../../src/app/services/auth.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_17__services_put_service__ = __webpack_require__("../../../../../src/app/services/put.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_18__routes__ = __webpack_require__("../../../../../src/routes.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_19__environments_environment__ = __webpack_require__("../../../../../src/environments/environment.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_20__components_base_component_base_component_component__ = __webpack_require__("../../../../../src/app/components/base-component/base-component.component.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};















// import { UserListComponent } from './components/user-list/user-list.component';
// import { UserItemComponent } from './components/user-item/user-item.component';
// import { LoginFormComponent } from './components/login-form/login-form.component';
// import { SignupFormComponent } from './components/signup-form/signup-form.component';






var AppModule = (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_1__angular_core__["I" /* NgModule */])({
            declarations: [
                __WEBPACK_IMPORTED_MODULE_9__app_component__["a" /* AppComponent */],
                __WEBPACK_IMPORTED_MODULE_10__components_chat_form_chat_form_component__["a" /* ChatFormComponent */],
                __WEBPACK_IMPORTED_MODULE_11__components_chatroom_chatroom_component__["a" /* ChatroomComponent */],
                __WEBPACK_IMPORTED_MODULE_12__components_feed_feed_component__["a" /* FeedComponent */],
                __WEBPACK_IMPORTED_MODULE_13__components_message_message_component__["a" /* MessageComponent */],
                __WEBPACK_IMPORTED_MODULE_14__components_navbar_navbar_component__["a" /* NavbarComponent */],
                // UserListComponent,
                // UserItemComponent,
                // LoginFormComponent,
                // SignupFormComponent,
                __WEBPACK_IMPORTED_MODULE_20__components_base_component_base_component_component__["a" /* BaseComponentComponent */]
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_5__angular_http__["c" /* HttpModule */],
                __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_common_http__["a" /* HttpClientModule */],
                __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */],
                __WEBPACK_IMPORTED_MODULE_3__angular_router__["b" /* RouterModule */].forRoot(__WEBPACK_IMPORTED_MODULE_18__routes__["a" /* appRoutes */]),
                __WEBPACK_IMPORTED_MODULE_7_angularfire2__["a" /* AngularFireModule */],
                __WEBPACK_IMPORTED_MODULE_6_angularfire2_database_deprecated__["b" /* AngularFireDatabaseModule */],
                __WEBPACK_IMPORTED_MODULE_7_angularfire2__["a" /* AngularFireModule */].initializeApp(__WEBPACK_IMPORTED_MODULE_19__environments_environment__["a" /* environment */].firebase),
            ],
            providers: [__WEBPACK_IMPORTED_MODULE_16__services_auth_service__["a" /* AuthService */], __WEBPACK_IMPORTED_MODULE_15__services_chat_service__["a" /* ChatService */], __WEBPACK_IMPORTED_MODULE_8_angularfire2_auth__["a" /* AngularFireAuth */], __WEBPACK_IMPORTED_MODULE_17__services_put_service__["a" /* PutService */]
            ],
            bootstrap: [__WEBPACK_IMPORTED_MODULE_9__app_component__["a" /* AppComponent */]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "../../../../../src/app/components/base-component/base-component.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, ".basecomponent{\r\n    overflow: hidden;\r\n}\r\n\r\n\r\n.baseClass {\r\n    /* background-color: #fff; */\r\n    /* background-size: cover; */\r\n    /* background: \r\n        linear-gradient(181deg, rgba(100,200,255,0.6), rgba(0, 0, 0, 0.9)),\r\n        url('../../assets/img/img11.jpg') center cover no-repeat; */\r\n    background:  linear-gradient(181deg, rgba(100,200,255,0.6), rgba(0, 0, 0, 0.9)),url(" + __webpack_require__("../../../../../src/assets/img/b5.jpg") + ") no-repeat center center fixed;\r\n    background-size: cover;\r\n    font-family: \"Open Sans\", sans-serif;\r\n    font-size: 1.2em;\r\n    min-height: 100vh;\r\n    height: 100%;\r\n    /* flex: 5; */\r\n    /* order: 2; */\r\n     overflow-y: hidden;\r\n    padding:20px 0px 0px 24px;\r\n}\r\n\r\n.chatroom_small{\r\n    height: 550px;\r\n    width: 380px;\r\n    margin-left: 880px;\r\n    margin-top: 10px;\r\n    border-radius:5em;\r\n    box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\r\n\r\n}\r\n\r\n.main-heading{\r\n    width:100%;\r\n    height:60px;\r\n    background-color: rgba(39, 41, 48, 0.945);\r\n    font-family: \"Palatino Linotype\", \"Book Antiqua\", Palatino, serif;\r\n    color: rgb(250, 250, 250);\r\n    -webkit-box-flex: 5;\r\n        -ms-flex: 5;\r\n            flex: 5;\r\n    padding: 24px 0px 90px 10px;\r\n    font-size: 1.8em;\r\n    font-weight: bold;\r\n\r\n\r\n    \r\n}\r\n\r\n.navBarBase{\r\n    width: 100%;\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -webkit-box-orient: horizontal;\r\n    -webkit-box-direction: normal;\r\n        -ms-flex-direction: row;\r\n            flex-direction: row;\r\n    background-color: rgb(255, 255, 255);\r\n    border-top-right-radius: 0.7em;\r\n    border-top-left-radius: 0.7em;\r\n    height:66px;\r\n    box-shadow: 0 8px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\r\n}\r\n\r\n#logo{\r\n    display: inline-block;\r\n    background: url(" + __webpack_require__("../../../../../src/assets/img/logo2.png") + ") no-repeat;\r\n    background-size: cover;\r\n    margin: 12px 10px 30px 32px;\r\n    width: 50px;\r\n    height: 50px;\r\n    min-width: 50px;\r\n}\r\n\r\n#heading{\r\n    -webkit-box-flex: 4;\r\n        -ms-flex: 4;\r\n            flex: 4;\r\n    padding: 16px 0px 90px 10px;\r\n    height: 30px;\r\n    font-size: 1.8em;\r\n    font-weight: bold;\r\n    /* font-family: \"Arial, Helvetica, sans-serif\"; */\r\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/components/base-component/base-component.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- <div class=\"navbar\"> \n  <app-navbar></app-navbar>\n  </div> -->\n<div class=\"basecomponent\">\n  <div class=\"navBarBase\">\n    <div id=\"logo\"></div>\n    <div id=\"heading\">Manhattan Virtual Assistant</div>\n  </div>\n  <!-- <div class=\"main-heading\"> \n\n      <p>Manh Virtual Assistant</p>\n      </div> -->\n\n  <div class=\"baseClass\">\n    <div class=\"chatroom_small\">\n      <app-chatroom></app-chatroom>\n    </div>\n\n  </div>\n\n</div>"

/***/ }),

/***/ "../../../../../src/app/components/base-component/base-component.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return BaseComponentComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var BaseComponentComponent = (function () {
    function BaseComponentComponent() {
    }
    BaseComponentComponent.prototype.ngOnInit = function () {
    };
    BaseComponentComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-base-component',
            template: __webpack_require__("../../../../../src/app/components/base-component/base-component.component.html"),
            styles: [__webpack_require__("../../../../../src/app/components/base-component/base-component.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], BaseComponentComponent);
    return BaseComponentComponent;
}());



/***/ }),

/***/ "../../../../../src/app/components/chat-form/chat-form.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, ".chatInput{\r\n    /* height: 10px; */\r\n    -webkit-box-flex: 4;\r\n        -ms-flex: 4;\r\n            flex: 4;\r\n    font-size: 0.6em;\r\n    font-family: 'Open Sans', sans-serif;\r\n    background-color: #eee;\r\n    color: #000;\r\n    transition: 0.1s ease-out;\r\n    padding-left: 10px;\r\n    border-bottom-left-radius: 0.7em;\r\n  \r\n}\r\n\r\n.chatInput:focus{\r\n    background-color: #E4F1FE;\r\n    color: #222;\r\n    transition: 0.2s ease-in;\r\n}\r\n\r\n.chatButton{\r\n    -webkit-box-flex: 0.5;\r\n        -ms-flex: 0.5;\r\n            flex: 0.5;\r\n    padding: 10px;\r\n    padding: 8px 24px;\r\n    font-size: 0.6em;\r\n    font-family: 'Droid Sans', sans-serif;\r\n    background-color: #2A2845;\r\n    color: white;\r\n    transition: 0.2s ease-out;\r\n    min-width: 50px;\r\n    border-bottom-right-radius: 0.7em;\r\n}\r\n\r\n.chatButton:hover{\r\n    background-color: #444;\r\n}\r\n\r\n\r\n.mic{\r\n    -webkit-box-flex: 1;\r\n        -ms-flex: 1;\r\n            flex: 1;\r\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/components/chat-form/chat-form.component.html":
/***/ (function(module, exports) {

module.exports = "<input\n     class=\"chatInput\"\n     placeholder=\"Ask something...\"\n    [(ngModel)]=\"message\"\n    (keydown)=\"handleSubmit($event)\" />\n\n<button class=\"chatButton\" \n(click)=send()>Send</button>\n\n\n\n\n"

/***/ }),

/***/ "../../../../../src/app/components/chat-form/chat-form.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ChatFormComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_chat_service__ = __webpack_require__("../../../../../src/app/services/chat.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ChatFormComponent = (function () {
    function ChatFormComponent(chat) {
        this.chat = chat;
        this.emitter = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["v" /* EventEmitter */]();
    }
    ChatFormComponent.prototype.ngOnInit = function () {
    };
    ChatFormComponent.prototype.send = function () {
        this.emitter.emit(this.message);
        this.message = '';
    };
    ChatFormComponent.prototype.handleSubmit = function (event) {
        if (event.keyCode === 13) {
            this.send();
        }
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["P" /* Output */])(),
        __metadata("design:type", Object)
    ], ChatFormComponent.prototype, "emitter", void 0);
    ChatFormComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-chat-form',
            template: __webpack_require__("../../../../../src/app/components/chat-form/chat-form.component.html"),
            styles: [__webpack_require__("../../../../../src/app/components/chat-form/chat-form.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__services_chat_service__["a" /* ChatService */]])
    ], ChatFormComponent);
    return ChatFormComponent;
}());



/***/ }),

/***/ "../../../../../src/app/components/chatroom/chatroom.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, ".mainContent{\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n}\r\n\r\n.navbar{\r\n    height: 80px;\r\n    background-color: #2A2845;\r\n    border-radius: 5em;\r\n}\r\n.userListWrapper {\r\n    background-color: #2A2845;\r\n    color: #fff;\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    font-family: \"Open Sans\", sans-serif;\r\n    font-size: 1.2em;\r\n    -webkit-box-flex: 1;\r\n        -ms-flex: 1;\r\n            flex: 1;\r\n    -webkit-box-ordinal-group: 2;\r\n        -ms-flex-order: 1;\r\n            order: 1;\r\n    padding:20px 0px 40px 30px;\r\n    border-right: 1px solid #222;\r\n}\r\n\r\n.feedWrapper {\r\n    background-color: #fff;\r\n    background: \r\n        linear-gradient(181deg, rgba(100,200,255,0.6), rgba(0, 0, 0, 0.9)),\r\n        url(" + __webpack_require__("../../../../../src/assets/img/img9.jpg") + ") center center no-repeat;;\r\n    font-family: \"Open Sans\", sans-serif;\r\n    font-size: 1.2em;\r\n    -webkit-box-flex: 5;\r\n        -ms-flex: 5;\r\n            flex: 5;\r\n    -webkit-box-ordinal-group: 3;\r\n        -ms-flex-order: 2;\r\n            order: 2;\r\n    overflow-y: scroll;\r\n    padding:20px 0px 0px 24px;\r\n}\r\n\r\n.chatFormWrapper {\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    height: 35px;\r\n    background-color: #eee;\r\n    border-bottom-left-radius: 2em;\r\n    border-bottom-right-radius: 2em;\r\n    z-index: 3;\r\n}\r\n\r\n#scroll-style::-webkit-scrollbar-track\r\n{\r\n\tborder-radius: 10px;\r\n\tbackground-color: #F5F5F5;\r\n}\r\n\r\napp-user-list {\r\n    width: 100%;\r\n}\r\n", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/components/chatroom/chatroom.component.html":
/***/ (function(module, exports) {

module.exports = "\n<div class=\"navbar\"> \n<app-navbar></app-navbar>\n</div>\n<div class=\"mainContent\">\n      <div #scroller class=\"feedWrapper\">\n        <app-feed [msg]=msg></app-feed>\n        \n      </div>\n\n  </div>\n\n  <div class=\"chatFormWrapper\">\n    <app-chat-form (emitter)=\"getMessage($event)\"></app-chat-form>\n  </div>"

/***/ }),

/***/ "../../../../../src/app/components/chatroom/chatroom.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ChatroomComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var ChatroomComponent = (function () {
    function ChatroomComponent() {
    }
    ChatroomComponent.prototype.ngOnInit = function () {
    };
    ChatroomComponent.prototype.scrollToBottom = function () {
        this.feedContainer.nativeElement.scrollTop
            = this.feedContainer.nativeElement.scrollHeight;
    };
    ChatroomComponent.prototype.ngAfterViewChecked = function () {
        this.scrollToBottom();
    };
    ChatroomComponent.prototype.getMessage = function (event) {
        this.msg = event;
        console.log(this.msg);
        this.ngOnInit();
    };
    ChatroomComponent.prototype.ngOnChanges = function () {
    };
    ChatroomComponent.prototype.displaymessage = function () {
        return this.usertext;
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_9" /* ViewChild */])('scroller'),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_0__angular_core__["t" /* ElementRef */])
    ], ChatroomComponent.prototype, "feedContainer", void 0);
    ChatroomComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-chatroom',
            template: __webpack_require__("../../../../../src/app/components/chatroom/chatroom.component.html"),
            styles: [__webpack_require__("../../../../../src/app/components/chatroom/chatroom.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], ChatroomComponent);
    return ChatroomComponent;
}());



/***/ }),

/***/ "../../../../../src/app/components/feed/feed.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, ".feed{\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -webkit-box-orient: vertical;\r\n    -webkit-box-direction: normal;\r\n        -ms-flex-direction: column;\r\n            flex-direction: column;\r\n}\r\n\r\n.message{\r\n    -webkit-box-orient: vertical;\r\n    -webkit-box-direction: normal;\r\n        -ms-flex-direction: column;\r\n            flex-direction: column;\r\n    margin: 10px 0;\r\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/components/feed/feed.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"message\">\n  <app-message *ngFor=\"let data of list\"  [chatMessage]=data></app-message>\n  \n</div>\n\n"

/***/ }),

/***/ "../../../../../src/app/components/feed/feed.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return FeedComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_chat_service__ = __webpack_require__("../../../../../src/app/services/chat.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var FeedComponent = (function () {
    function FeedComponent(chat) {
        this.chat = chat;
        this.list = [];
    }
    FeedComponent.prototype.ngOnInit = function () {
        this.count = 0;
        this.list = [];
    };
    FeedComponent.prototype.ngOnChanges = function () {
        this.list.push(this.msg);
        this.count = this.list.length;
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["D" /* Input */])(),
        __metadata("design:type", String)
    ], FeedComponent.prototype, "msg", void 0);
    FeedComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-feed',
            template: __webpack_require__("../../../../../src/app/components/feed/feed.component.html"),
            styles: [__webpack_require__("../../../../../src/app/components/feed/feed.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__services_chat_service__["a" /* ChatService */]])
    ], FeedComponent);
    return FeedComponent;
}());



/***/ }),

/***/ "../../../../../src/app/components/message/message.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, ".messageContainer{\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    height: auto;\r\n    width: 15%;\r\n    min-width: 250px;\r\n    border-radius: 5px;\r\n    -webkit-box-align:stretch;\r\n        -ms-flex-align:stretch;\r\n            align-items:stretch;\r\n    background-color: rgb(14, 107, 173);\r\n    box-shadow: 0 3px 6px rgba(0,0,0,0.26), 0 3px 6px rgba(0,0,0,0.23);\r\n    margin-top: 0.5em;\r\n}\r\n\r\n\r\n\r\n.sendermessageContainer{\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    height: auto;\r\n    width: 15%;\r\n    min-width: 250px;\r\n    border-radius: 5px;\r\n    -webkit-box-align:stretch;\r\n        -ms-flex-align:stretch;\r\n            align-items:stretch;\r\n    background-color: rgb(150, 205, 240);\r\n    box-shadow: 0 3px 6px rgba(0,0,0,0.26), 0 3px 6px rgba(0,0,0,0.23);\r\n    margin-top: 0.5em;\r\n}\r\n.isOwnMessageContainer{\r\n    background-color: #01579B;\r\n}\r\n\r\n.issenderMessageContainer{\r\n    background-color: rgb(104, 178, 235);\r\n}\r\n\r\n\r\n\r\n.messageData{\r\n    -webkit-box-flex: 1;\r\n        -ms-flex: 1;\r\n            flex: 1;\r\n    padding: 5px;\r\n    font-size: 0.5em;\r\n}\r\n\r\n.sender{\r\n    display: block;\r\n    color: rgb(41, 76, 85);\r\n    font-weight: bold;\r\n}\r\n\r\n.isOwnSender{\r\n    color: rgb(192, 231, 248);\r\n}\r\n\r\n.timestamp {\r\n    color: rgb(19, 22, 24);\r\n    font-style: italic;\r\n}\r\n\r\n.isOwnTimestamp{\r\n    color: rgb(58, 184, 238);\r\n    font-style: italic;\r\n}\r\n\r\n.messageContent{\r\n    height: auto;\r\n    -webkit-box-flex: 9;\r\n        -ms-flex: 9;\r\n            flex: 9;\r\n    background-color: rgb(214, 236, 253);\r\n    padding: 10px;\r\n    border-top-right-radius: 5px;\r\n    border-bottom-right-radius: 5px;\r\n    font-size: 0.5em;\r\n    color: rgb(5, 45, 70);\r\n    font-style: italic;\r\n}\r\n\r\n.sendermessageContent{\r\n    height: auto;\r\n    -webkit-box-flex: 9;\r\n        -ms-flex: 9;\r\n            flex: 9;\r\n    background-color: rgb(240, 243, 245);\r\n    padding: 10px;\r\n    border-top-right-radius: 5px;\r\n    border-bottom-right-radius: 5px;\r\n    font-size: 0.5em;\r\n    color: rgb(30, 50, 63);\r\n    font-style: italic;\r\n}\r\n\r\n.isOwnMessageContent{\r\n    background-color: #E3F2FD;\r\n    color: #01579B;\r\n}\r\n\r\n.respMessageContent{\r\n    background-color: rgb(169, 209, 236);\r\n    color: #01579B;\r\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/components/message/message.component.html":
/***/ (function(module, exports) {

module.exports = "<div *ngIf=\"messageContent\">\r\n\r\n    <div class=\"messageContainer\" [ngClass]=\"{'isOwnMessageContainer':isOwnMessage}\">\r\n        <div class=\"messageData\" [ngClass]=\"{'isOwnMessageData':isOwnMessage}\">\r\n            <span class=\"timestamp\" [ngClass]=\"{'isOwnTimestamp':isOwnMessage}\">\r\n                {{ timeStamp | date:'shortTime' }}\r\n            </span>\r\n        </div>\r\n        <div class=\"messageContent\" [ngClass]=\"{'isOwnMessageContent':isOwnMessage}\">\r\n            {{ messageContent }}\r\n        </div>\r\n    </div>\r\n\r\n\r\n    <div class=\"sendermessageContainer\" [ngClass]=\"{'issenderMessageContainer':isOwnMessage}\">\r\n        <div class=\"messageData\" [ngClass]=\"{'isOwnMessageData':isOwnMessage}\">\r\n            <span class=\"timestamp\" [ngClass]=\"{'isOwnTimestamp':isOwnMessage}\">\r\n                {{ timeStamp | date:'shortTime' }}\r\n            </span>\r\n        </div>\r\n        <div class=\"sendermessageContent\" [ngClass]=\"{'respMessageContent':isOwnSender}\">\r\n            <p [innerHTML] = \"responseMessage\">\r\n            \r\n            </p>\r\n        </div>\r\n    </div>\r\n</div>"

/***/ }),

/***/ "../../../../../src/app/components/message/message.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MessageComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_auth_service__ = __webpack_require__("../../../../../src/app/services/auth.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_put_service__ = __webpack_require__("../../../../../src/app/services/put.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var MessageComponent = (function () {
    // isOwnMessage: boolean;
    // ownEmail: string;
    function MessageComponent(authService, putService) {
        this.authService = authService;
        this.putService = putService;
        this.timeStamp = new Date();
        this.url = 'http://blrlw6487:8080/virtualAssistant/getMessageFromVA';
    }
    MessageComponent.prototype.ngOnInit = function () {
        this.messageContent = this.chatMessage;
        console.log(this.messageContent);
        this.edit(this.messageContent);
    };
    MessageComponent.prototype.ngOnChanges = function () {
        this.messageContent = this.chatMessage;
        // this.ngOnInit();
    };
    MessageComponent.prototype.edit = function (arg) {
        var _this = this;
        console.log("edit-> " + arg);
        this.putService.putData(this.url, arg).
            then(function (res) {
            _this.responseMessage = res.result.fulfillment.speech;
            console.log(_this.responseMessage);
        }, function (error) {
            if (error == "400 - Bad Request") {
                _this.responseMessage = error;
                _this.errorOut();
            }
        });
    };
    MessageComponent.prototype.errorOut = function () {
        this.ngOnInit();
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["D" /* Input */])(),
        __metadata("design:type", String)
    ], MessageComponent.prototype, "chatMessage", void 0);
    MessageComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-message',
            template: __webpack_require__("../../../../../src/app/components/message/message.component.html"),
            styles: [__webpack_require__("../../../../../src/app/components/message/message.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__services_auth_service__["a" /* AuthService */], __WEBPACK_IMPORTED_MODULE_2__services_put_service__["a" /* PutService */]])
    ], MessageComponent);
    return MessageComponent;
}());



/***/ }),

/***/ "../../../../../src/app/components/navbar/navbar.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, ".navBar{\r\n    width: 100%;\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -webkit-box-orient: horizontal;\r\n    -webkit-box-direction: normal;\r\n        -ms-flex-direction: row;\r\n            flex-direction: row;\r\n    background-color: rgb(255, 255, 255);\r\n    border-top-right-radius: 0.7em;\r\n    border-top-left-radius: 0.7em;\r\n    height:66px;\r\n}\r\n\r\n#logo{\r\n    display: inline-block;\r\n    background: url(" + __webpack_require__("../../../../../src/assets/img/logo2.png") + ") no-repeat;\r\n    background-size: cover;\r\n    margin: 12px 10px 12px 32px;\r\n    width: 50px;\r\n    height: 50px;\r\n    min-width: 50px;\r\n}\r\n\r\n#heading{\r\n    -webkit-box-flex: 4;\r\n        -ms-flex: 4;\r\n            flex: 4;\r\n    padding: 24px 0px 8px 10px;\r\n    height: 30px;\r\n    font-size: 1em;\r\n    font-weight: bold;\r\n}\r\n\r\n.links{\r\n    padding-top: 32px;\r\n    padding-right: 30px;\r\n    white-space: nowrap;\r\n    display: block;\r\n}\r\n\r\n#heading > a{\r\n    text-decoration: none;\r\n    color: black;\r\n}\r\n\r\n.links a{\r\n    color: #555;\r\n    text-decoration: none;\r\n    transition: ease-in 0.2s;\r\n    padding-right: 12px;\r\n    overflow: hidden;\r\n}\r\n\r\n.links a:hover {\r\n    color: #1E88E5;\r\n    transition: ease-in 0.2s;\r\n}\r\n\r\n#userEmail {\r\n    padding-right: 16px;\r\n    font-weight: bold;\r\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/components/navbar/navbar.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"navBar\">\n    <div id=\"logo\"></div>\n    <div id=\"heading\">ManhVirtualAssistant</div>\n</div>\n"

/***/ }),

/***/ "../../../../../src/app/components/navbar/navbar.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return NavbarComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_auth_service__ = __webpack_require__("../../../../../src/app/services/auth.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var NavbarComponent = (function () {
    function NavbarComponent(authService) {
        this.authService = authService;
    }
    NavbarComponent.prototype.ngOnInit = function () {
    };
    NavbarComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-navbar',
            template: __webpack_require__("../../../../../src/app/components/navbar/navbar.component.html"),
            styles: [__webpack_require__("../../../../../src/app/components/navbar/navbar.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__services_auth_service__["a" /* AuthService */]])
    ], NavbarComponent);
    return NavbarComponent;
}());



/***/ }),

/***/ "../../../../../src/app/models/ManhApiConstants.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ManhApiConstants; });
var ManhApiConstants;
(function (ManhApiConstants) {
    ManhApiConstants.DEFAULT_BASE_URL = "http://blrlw4391:8080/virtualAssistant/getMessageFromVA/";
})(ManhApiConstants || (ManhApiConstants = {}));


/***/ }),

/***/ "../../../../../src/app/services/ApiManhClient.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ApiManhClient; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0_api_ai_javascript_ts_Errors__ = __webpack_require__("../../../../api-ai-javascript/ts/Errors.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_api_ai_javascript_ts_Request_EventRequest__ = __webpack_require__("../../../../api-ai-javascript/ts/Request/EventRequest.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_api_ai_javascript_ts_Request_TextRequest__ = __webpack_require__("../../../../api-ai-javascript/ts/Request/TextRequest.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__models_ManhApiConstants__ = __webpack_require__("../../../../../src/app/models/ManhApiConstants.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_api_ai_javascript_ts_ApiAiClient__ = __webpack_require__("../../../../api-ai-javascript/ts/ApiAiClient.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_api_ai_javascript_ts_Interfaces__ = __webpack_require__("../../../../api-ai-javascript/ts/Interfaces.ts");
/* unused harmony namespace reexport */
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6_api_ai_javascript_ts_ApiAiConstants__ = __webpack_require__("../../../../api-ai-javascript/ts/ApiAiConstants.ts");
/* unused harmony reexport ApiAiConstants */
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();







var ApiManhClient = (function (_super) {
    __extends(ApiManhClient, _super);
    function ApiManhClient(options) {
        var _this = _super.call(this, options) || this;
        _this.apiManhBaseUrl = options.baseUrl || __WEBPACK_IMPORTED_MODULE_3__models_ManhApiConstants__["a" /* ManhApiConstants */].DEFAULT_BASE_URL;
        return _this;
    }
    ApiManhClient.prototype.textRequest = function (query, options) {
        if (options === void 0) { options = {}; }
        if (!query) {
            throw new __WEBPACK_IMPORTED_MODULE_0_api_ai_javascript_ts_Errors__["a" /* ApiAiClientConfigurationError */]("Query should not be empty");
        }
        options.query = query;
        return new __WEBPACK_IMPORTED_MODULE_2_api_ai_javascript_ts_Request_TextRequest__["a" /* default */](this, options).perform();
    };
    ApiManhClient.prototype.eventRequest = function (eventName, eventData, options) {
        if (eventData === void 0) { eventData = {}; }
        if (options === void 0) { options = {}; }
        if (!eventName) {
            throw new __WEBPACK_IMPORTED_MODULE_0_api_ai_javascript_ts_Errors__["a" /* ApiAiClientConfigurationError */]("Event name can not be empty");
        }
        options.event = { name: eventName, data: eventData };
        return new __WEBPACK_IMPORTED_MODULE_1_api_ai_javascript_ts_Request_EventRequest__["a" /* EventRequest */](this, options).perform();
    };
    // @todo: implement local tts request
    /*public ttsRequest(query) {
        if (!query) {
            throw new ApiAiClientConfigurationError("Query should not be empty");
        }
        return new TTSRequest(this).makeTTSRequest(query);
    }*/
    /*public userEntitiesRequest(options: IRequestOptions = {}): UserEntitiesRequest {
        return new UserEntitiesRequest(this, options);
    }*/
    ApiManhClient.prototype.getApiBaseUrl = function () {
        return (this.apiManhBaseUrl) ? this.apiManhBaseUrl : __WEBPACK_IMPORTED_MODULE_3__models_ManhApiConstants__["a" /* ManhApiConstants */].DEFAULT_BASE_URL;
    };
    return ApiManhClient;
}(__WEBPACK_IMPORTED_MODULE_4_api_ai_javascript_ts_ApiAiClient__["a" /* ApiAiClient */]));



/***/ }),

/***/ "../../../../../src/app/services/auth.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AuthService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_angularfire2_auth__ = __webpack_require__("../../../../angularfire2/auth/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_angularfire2_database_deprecated__ = __webpack_require__("../../../../angularfire2/database-deprecated/index.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var AuthService = (function () {
    function AuthService(afAuth, db, router) {
        this.afAuth = afAuth;
        this.db = db;
        this.router = router;
        this.user = afAuth.authState;
    }
    AuthService.prototype.authUser = function () {
        return this.user;
    };
    AuthService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2_angularfire2_auth__["a" /* AngularFireAuth */],
            __WEBPACK_IMPORTED_MODULE_3_angularfire2_database_deprecated__["a" /* AngularFireDatabase */],
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* Router */]])
    ], AuthService);
    return AuthService;
}());



/***/ }),

/***/ "../../../../../src/app/services/chat.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ChatService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_angularfire2_database_deprecated__ = __webpack_require__("../../../../angularfire2/database-deprecated/index.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

//import { AngularFireDatabase } from 'angularfire2/database';

var ChatService = (function () {
    function ChatService(db
        // private afAuth: AngularFireAuth
    ) {
        this.db = db;
    }
    ChatService.prototype.dispMessage = function (msg) {
    };
    ChatService.prototype.sendMessage = function (msg) {
        var timestamp = this.getTimeStamp();
        console.log("calling send messages");
        this.chatMessages = this.getMessages();
        this.chatMessages.push({
            message: msg,
            timeSent: timestamp,
        });
    };
    ChatService.prototype.getMessages = function () {
        // query to create our message feed binding
        console.log("called getmessages..!!");
        return this.db.list('messages', {
            query: {
                limitToLast: 15,
                orderByKey: true
            }
        });
    };
    ChatService.prototype.getTimeStamp = function () {
        var now = new Date();
        var date = now.getUTCFullYear() + '/' +
            (now.getUTCMonth() + 1) + '/' +
            now.getUTCDate();
        var time = now.getUTCHours() + ':' +
            (now.getUTCMinutes() + 1) + ':' +
            now.getUTCSeconds();
        return (date + ' ' + time);
    };
    ChatService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_angularfire2_database_deprecated__["a" /* AngularFireDatabase */]
            // private afAuth: AngularFireAuth
        ])
    ], ChatService);
    return ChatService;
}());



/***/ }),

/***/ "../../../../../src/app/services/put.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return PutService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__("../../../http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__ = __webpack_require__("../../../../rxjs/_esm5/Rx.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_Observable__ = __webpack_require__("../../../../rxjs/_esm5/Observable.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_rxjs_add_operator_map__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/map.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_observable_throw__ = __webpack_require__("../../../../rxjs/_esm5/add/observable/throw.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6_rxjs_add_operator_catch__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/catch.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__ApiManhClient__ = __webpack_require__("../../../../../src/app/services/ApiManhClient.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


// import { Observable } from 'rxjs/Observable';



// import { Observable } from 'rxjs/Rx';



var PutService = (function () {
    function PutService(http) {
        this.http = http;
        this.client = new __WEBPACK_IMPORTED_MODULE_7__ApiManhClient__["a" /* ApiManhClient */]({ accessToken: "Dummytoken" });
        this.headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/json' });
        this.options = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["d" /* RequestOptions */]({ headers: this.headers });
        this.aiSessionID = "";
    }
    PutService.prototype.setAiSessionId = function (aiSessionID) {
        this.aiSessionID = aiSessionID;
    };
    PutService.prototype.putData = function (url, param) {
        //let body = {};
        //     //   body.query = param;
        //     //   body.aiSessionID = this.aiSessionID;
        return this.client.textRequest(param);
        /*return this.http
            .post(url, body, this.options)
            .map(this.extractData)
            .catch(this.handleError);*/
    };
    // JSON.stringify(param)
    // PutData(url:string,param:any){
    // }
    PutService.prototype.extractData = function (res) {
        var resObj = JSON.parse(res.text());
        return resObj.text || {};
    };
    PutService.prototype.handleError = function (error) {
        var errMsg = (error.message) ? error.message :
            error.status ? error.status + " - " + error.statusText : 'Server error';
        // console.error(errMsg);
        return __WEBPACK_IMPORTED_MODULE_3_rxjs_Observable__["a" /* Observable */].throw(errMsg);
    };
    PutService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]])
    ], PutService);
    return PutService;
}());



/***/ }),

/***/ "../../../../../src/assets/img/b5.jpg":
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__.p + "b5.d0840e0a5c08c3039639.jpg";

/***/ }),

/***/ "../../../../../src/assets/img/img9.jpg":
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__.p + "img9.03d7818b8b6722d1817a.jpg";

/***/ }),

/***/ "../../../../../src/assets/img/logo2.png":
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__.p + "logo2.5fe4aa71f6c735c226a0.png";

/***/ }),

/***/ "../../../../../src/environments/environment.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return environment; });
// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.
var environment = {
    production: false,
    firebase: {
        apiKey: 'AIzaSyA1qqA44NCsjrxH8p9h1TPCRlas3L7Vw7U',
        authDomain: 'chat-demo-e5643.firebaseapp.com',
        databaseURL: 'https://chat-demo-e5643.firebaseio.com',
        projectId: 'chat-demo-e5643',
        storageBucket: '',
        messagingSenderId: '944585663623'
    }
};


/***/ }),

/***/ "../../../../../src/main.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__("../../../platform-browser-dynamic/esm5/platform-browser-dynamic.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__("../../../../../src/app/app.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__("../../../../../src/environments/environment.ts");




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* environment */].production) {
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_14" /* enableProdMode */])();
}
Object(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ "../../../../../src/routes.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return appRoutes; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__app_components_base_component_base_component_component__ = __webpack_require__("../../../../../src/app/components/base-component/base-component.component.ts");
// import { SignupFormComponent } from './app/components/signup-form/signup-form.component';
// import { LoginFormComponent } from './app/components/login-form/login-form.component';

var appRoutes = [
    //  {path: 'signup',component: SignupFormComponent },
    // {path: '', component: LoginFormComponent },
    { path: 'chat', component: __WEBPACK_IMPORTED_MODULE_0__app_components_base_component_base_component_component__["a" /* BaseComponentComponent */] },
    { path: '', redirectTo: '/chat', pathMatch: 'full' },
];


/***/ }),

/***/ 0:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("../../../../../src/main.ts");


/***/ })

},[0]);
//# sourceMappingURL=main.bundle.js.map