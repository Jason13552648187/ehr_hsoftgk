(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-6e763dc2"],{4765:function(e,t,a){"use strict";a.d(t,"a",(function(){return i}));var n=a("d4ec"),r=a("bee2"),i=function(){function e(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};Object(n["a"])(this,e),this.$store=null,this.$store=t.$store}return Object(r["a"])(e,[{key:"getStore",value:function(){return this.$store}},{key:"getService",value:function(e){return window["uiServiceRegister"].getService(e)}}]),e}()},"657a":function(e,t,a){"use strict";a.r(t);var n=a("d4ec"),r=a("99de"),i=a("7e84"),s=a("262e"),u=(a("99af"),a("4160"),a("4ec9"),a("d3b7"),a("3ca3"),a("159b"),a("ddb0"),a("96cf"),a("1da1")),c=a("bee2"),l=a("032b"),o=a("4765"),h=a("8da4"),b=function(e){function t(){var e,a=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,t),e=Object(r["a"])(this,Object(i["a"])(t).call(this,a)),e.isEnableWorkflow=!1,e.dataService=new h["default"],e.allViewMap=new Map,e.stateValue=0,e.stateField="",e.mainStateFields=[],e.allDeMainStateMap=new Map,e.initViewMap(),e.initDeMainStateMap(),e}return Object(s["a"])(t,e),Object(c["a"])(t,[{key:"initViewMap",value:function(){}},{key:"initDeMainStateMap",value:function(){}},{key:"getRDAppView",value:function(){var e=Object(u["a"])(regeneratorRuntime.mark((function e(t,a){var n,r,i,s,u;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.isEnableWorkflow=a,e.next=3,this.dataService.Get({pcmxkml:t});case 3:if(n=e.sent,r=n.data,!0,i=!1,s=!1,!this.isEnableWorkflow){e.next=17;break}return e.next=11,this.dataService.testDataInWF({stateValue:this.stateValue,stateField:this.stateField},r);case 11:if(i=e.sent,!i){e.next=17;break}return i=!0,e.next=16,this.dataService.testUserExistWorklist(null,r);case 16:s=e.sent;case 17:return e.next=19,this.getDESDDEViewPDTParam(r,i,s);case 19:return u=e.sent,e.abrupt("return",this.allViewMap.get(u));case 21:case"end":return e.stop()}}),e,this)})));function t(t,a){return e.apply(this,arguments)}return t}()},{key:"getRealDEType",value:function(e){}},{key:"getDESDDEViewPDTParam",value:function(){var e=Object(u["a"])(regeneratorRuntime.mark((function e(t,a,n){var r,i,s;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if("",r=!1,i=null,!r||!i){e.next=9;break}if(s=t[i],l["a"].isAppMode){e.next=8;break}return e.abrupt("return","MOBEDITVIEW"+s);case 8:return e.abrupt("return","EDITVIEW"+s);case 9:if(l["a"].isAppMode){e.next=17;break}if(!this.getDEMainStateTag(t)){e.next=16;break}return e.t0="MOBEDITVIEW:MSTAG:",e.next=14,this.getDEMainStateTag(t);case 14:return e.t1=e.sent,e.abrupt("return",e.t0.concat.call(e.t0,e.t1));case 16:return e.abrupt("return","MOBEDITVIEW:");case 17:if(!this.getDEMainStateTag(t)){e.next=23;break}return e.t2="EDITVIEW:MSTAG:",e.next=21,this.getDEMainStateTag(t);case 21:return e.t3=e.sent,e.abrupt("return",e.t2.concat.call(e.t2,e.t3));case 23:return e.abrupt("return","EDITVIEW:");case 24:case"end":return e.stop()}}),e,this)})));function t(t,a,n){return e.apply(this,arguments)}return t}()},{key:"getDEMainStateTag",value:function(){var e=Object(u["a"])(regeneratorRuntime.mark((function e(t){var a,n,r,i,s,u;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(0!==this.mainStateFields.length){e.next=2;break}return e.abrupt("return",null);case 2:this.mainStateFields.forEach((function(e){e in t||console.error("当前数据对象不包含属性singleMainField，可能会发生错误")})),"",a=0;case 5:if(!(a<=1)){e.next=31;break}if(n=t[this.mainStateFields[0]]&&0==a?t[this.mainStateFields[0]]:"",!(this.mainStateFields.length>=2)){e.next=27;break}r=0;case 9:if(!(r<=1)){e.next=25;break}if(i=t[this.mainStateFields[1]]?"".concat(n,"__").concat(0==r?t[this.mainStateFields[1]]:""):n,!(this.mainStateFields.length>=3)){e.next=21;break}s=0;case 13:if(!(s<=1)){e.next=19;break}return u=t[this.mainStateFields[2]]?"".concat(i,"__").concat(0==s?t[this.mainStateFields[2]]:""):i,e.abrupt("return",this.allDeMainStateMap.get(u));case 16:s++,e.next=13;break;case 19:e.next=22;break;case 21:return e.abrupt("return",this.allDeMainStateMap.get(i));case 22:r++,e.next=9;break;case 25:e.next=28;break;case 27:return e.abrupt("return",this.allDeMainStateMap.get(n));case 28:a++,e.next=5;break;case 31:return e.abrupt("return",null);case 32:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}()}]),t}(o["a"]);a.d(t,"default",(function(){return p}));var p=function(e){function t(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,t),Object(r["a"])(this,Object(i["a"])(t).call(this,e))}return Object(s["a"])(t,e),t}(b)}}]);