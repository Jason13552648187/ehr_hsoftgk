(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-81ae5c16","chunk-2d22977c"],{4765:function(e,t,r){"use strict";r.d(t,"a",(function(){return i}));var n=r("d4ec"),a=r("bee2"),i=function(){function e(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};Object(n["a"])(this,e),this.$store=null,this.$store=t.$store}return Object(a["a"])(e,[{key:"getStore",value:function(){return this.$store}},{key:"getService",value:function(e){return window["uiServiceRegister"].getService(e)}}]),e}()},"870ec":function(e,t,r){"use strict";r.r(t);var n=r("d4ec"),a=r("99de"),i=r("7e84"),u=r("262e"),s=(r("99af"),r("4160"),r("4ec9"),r("d3b7"),r("3ca3"),r("159b"),r("ddb0"),r("96cf"),r("1da1")),c=r("bee2"),o=r("032b"),l=r("4765"),h=r("de27"),p=function(e){function t(){var e,r=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,t),e=Object(a["a"])(this,Object(i["a"])(t).call(this,r)),e.isEnableWorkflow=!1,e.dataService=new h["default"],e.allViewMap=new Map,e.stateValue=0,e.stateField="",e.mainStateFields=[],e.allDeMainStateMap=new Map,e.initViewMap(),e.initDeMainStateMap(),e}return Object(u["a"])(t,e),Object(c["a"])(t,[{key:"initViewMap",value:function(){}},{key:"initDeMainStateMap",value:function(){}},{key:"getRDAppView",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(t,r){var n,a,i,u,s;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.isEnableWorkflow=r,e.next=3,this.dataService.Get({ormuser:t});case 3:if(n=e.sent,a=n.data,!0,i=!1,u=!1,!this.isEnableWorkflow){e.next=17;break}return e.next=11,this.dataService.testDataInWF({stateValue:this.stateValue,stateField:this.stateField},a);case 11:if(i=e.sent,!i){e.next=17;break}return i=!0,e.next=16,this.dataService.testUserExistWorklist(null,a);case 16:u=e.sent;case 17:return e.next=19,this.getDESDDEViewPDTParam(a,i,u);case 19:return s=e.sent,e.abrupt("return",this.allViewMap.get(s));case 21:case"end":return e.stop()}}),e,this)})));function t(t,r){return e.apply(this,arguments)}return t}()},{key:"getRealDEType",value:function(e){}},{key:"getDESDDEViewPDTParam",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(t,r,n){var a,i,u;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if("",a=!1,i=null,!a||!i){e.next=9;break}if(u=t[i],o["a"].isAppMode){e.next=8;break}return e.abrupt("return","MOBEDITVIEW"+u);case 8:return e.abrupt("return","EDITVIEW"+u);case 9:if(o["a"].isAppMode){e.next=17;break}if(!this.getDEMainStateTag(t)){e.next=16;break}return e.t0="MOBEDITVIEW:MSTAG:",e.next=14,this.getDEMainStateTag(t);case 14:return e.t1=e.sent,e.abrupt("return",e.t0.concat.call(e.t0,e.t1));case 16:return e.abrupt("return","MOBEDITVIEW:");case 17:if(!this.getDEMainStateTag(t)){e.next=23;break}return e.t2="EDITVIEW:MSTAG:",e.next=21,this.getDEMainStateTag(t);case 21:return e.t3=e.sent,e.abrupt("return",e.t2.concat.call(e.t2,e.t3));case 23:return e.abrupt("return","EDITVIEW:");case 24:case"end":return e.stop()}}),e,this)})));function t(t,r,n){return e.apply(this,arguments)}return t}()},{key:"getDEMainStateTag",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(t){var r,n,a,i,u,s;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(0!==this.mainStateFields.length){e.next=2;break}return e.abrupt("return",null);case 2:this.mainStateFields.forEach((function(e){e in t||console.error("当前数据对象不包含属性singleMainField，可能会发生错误")})),"",r=0;case 5:if(!(r<=1)){e.next=31;break}if(n=t[this.mainStateFields[0]]&&0==r?t[this.mainStateFields[0]]:"",!(this.mainStateFields.length>=2)){e.next=27;break}a=0;case 9:if(!(a<=1)){e.next=25;break}if(i=t[this.mainStateFields[1]]?"".concat(n,"__").concat(0==a?t[this.mainStateFields[1]]:""):n,!(this.mainStateFields.length>=3)){e.next=21;break}u=0;case 13:if(!(u<=1)){e.next=19;break}return s=t[this.mainStateFields[2]]?"".concat(i,"__").concat(0==u?t[this.mainStateFields[2]]:""):i,e.abrupt("return",this.allDeMainStateMap.get(s));case 16:u++,e.next=13;break;case 19:e.next=22;break;case 21:return e.abrupt("return",this.allDeMainStateMap.get(i));case 22:a++,e.next=9;break;case 25:e.next=28;break;case 27:return e.abrupt("return",this.allDeMainStateMap.get(n));case 28:r++,e.next=5;break;case 31:return e.abrupt("return",null);case 32:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}()}]),t}(l["a"]);r.d(t,"default",(function(){return f}));var f=function(e){function t(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,t),Object(a["a"])(this,Object(i["a"])(t).call(this,e))}return Object(u["a"])(t,e),t}(p)},de27:function(e,t,r){"use strict";r.r(t);var n=r("d4ec"),a=r("99de"),i=r("7e84"),u=r("262e"),s=(r("96cf"),r("1da1")),c=r("bee2"),o=r("d257"),l=r("ce95"),h=function(e){function t(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,t),Object(a["a"])(this,Object(i["a"])(t).call(this,e))}return Object(u["a"])(t,e),Object(c["a"])(t,[{key:"initBasicData",value:function(){this.APPLYDEKEY="ormuser",this.APPDEKEY="orguserid",this.APPDENAME="ormusers",this.APPDETEXT="orgusername",this.APPNAME="ehrpim",this.SYSTEMNAME="ehr"}},{key:"Select",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var t,r,n=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=n.length>0&&void 0!==n[0]?n[0]:{},n.length>1&&void 0!==n[1]?n[1]:{},r=n.length>2?n[2]:void 0,e.abrupt("return",o["c"].getInstance().get("/ormusers/".concat(t.ormuser,"/select"),r));case 4:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Get",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=a.length>0&&void 0!==a[0]?a[0]:{},a.length>1&&void 0!==a[1]?a[1]:{},r=a.length>2?a[2]:void 0,e.next=5,o["c"].getInstance().get("/ormusers/".concat(t.ormuser),r);case 5:return n=e.sent,e.abrupt("return",n);case 7:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Create",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a,i,u=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=u.length>0&&void 0!==u[0]?u[0]:{},r=u.length>1&&void 0!==u[1]?u[1]:{},n=u.length>2?u[2]:void 0,a={},Object.assign(r,a),r.srffrontuf&&"1"===r.srffrontuf||(r[this.APPDEKEY]=null),r.srffrontuf&&delete r.srffrontuf,JSON.parse(JSON.stringify(t)),e.next=10,o["c"].getInstance().post("/ormusers",r,n);case 10:return i=e.sent,e.abrupt("return",i);case 12:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Remove",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var t,r,n=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=n.length>0&&void 0!==n[0]?n[0]:{},n.length>1&&void 0!==n[1]?n[1]:{},r=n.length>2?n[2]:void 0,e.abrupt("return",o["c"].getInstance()["delete"]("/ormusers/".concat(t.ormuser),r));case 4:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Update",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a,i,u=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=u.length>0&&void 0!==u[0]?u[0]:{},r=u.length>1&&void 0!==u[1]?u[1]:{},n=u.length>2?u[2]:void 0,a={},Object.assign(r,a),e.next=7,o["c"].getInstance().put("/ormusers/".concat(t.ormuser),r,n);case 7:return i=e.sent,e.abrupt("return",i);case 9:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"CheckKey",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=a.length>0&&void 0!==a[0]?a[0]:{},r=a.length>1&&void 0!==a[1]?a[1]:{},n=a.length>2?a[2]:void 0,e.abrupt("return",o["c"].getInstance().post("/ormusers/".concat(t.ormuser,"/checkkey"),r,n));case 4:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Save",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a,i,u=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=u.length>0&&void 0!==u[0]?u[0]:{},r=u.length>1&&void 0!==u[1]?u[1]:{},n=u.length>2?u[2]:void 0,a={},Object.assign(r,a),e.next=7,o["c"].getInstance().post("/ormusers/".concat(t.ormuser,"/save"),r,n);case 7:return i=e.sent,e.abrupt("return",i);case 9:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"GetDraft",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a.length>0&&void 0!==a[0]?a[0]:{},t=a.length>1&&void 0!==a[1]?a[1]:{},r=a.length>2?a[2]:void 0,e.next=5,o["c"].getInstance().get("/ormusers/getdraft",r);case 5:return n=e.sent,n.data.ormuser=t.ormuser,e.abrupt("return",n);case 8:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"FetchDQZZJXJZZ",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a.length>0&&void 0!==a[0]?a[0]:{},t=a.length>1&&void 0!==a[1]?a[1]:{},r=a.length>2?a[2]:void 0,n=JSON.parse(JSON.stringify(t)),e.abrupt("return",o["c"].getInstance().get("/ormusers/fetchdqzzjxjzz",n,r));case 5:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"FetchDefault",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a.length>0&&void 0!==a[0]?a[0]:{},t=a.length>1&&void 0!==a[1]?a[1]:{},r=a.length>2?a[2]:void 0,n=JSON.parse(JSON.stringify(t)),e.abrupt("return",o["c"].getInstance().get("/ormusers/fetchdefault",n,r));case 5:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()}]),t}(l["a"]);r.d(t,"default",(function(){return p}));var p=function(e){function t(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,t),Object(a["a"])(this,Object(i["a"])(t).call(this,e))}return Object(u["a"])(t,e),t}(h)}}]);