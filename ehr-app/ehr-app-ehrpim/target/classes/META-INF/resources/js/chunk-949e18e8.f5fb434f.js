(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-949e18e8","chunk-2d21a717"],{4765:function(e,t,r){"use strict";r.d(t,"a",(function(){return i}));var n=r("d4ec"),a=r("bee2"),i=function(){function e(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};Object(n["a"])(this,e),this.$store=null,this.$store=t.$store}return Object(a["a"])(e,[{key:"getStore",value:function(){return this.$store}},{key:"getService",value:function(e){return window["uiServiceRegister"].getService(e)}}]),e}()},b7a9:function(e,t,r){"use strict";r.r(t);var n=r("d4ec"),a=r("99de"),i=r("7e84"),s=r("262e"),c=(r("99af"),r("4160"),r("4ec9"),r("d3b7"),r("3ca3"),r("159b"),r("ddb0"),r("96cf"),r("1da1")),o=r("bee2"),u=r("032b"),g=r("4765"),p=r("bc11"),l=function(e){function t(){var e,r=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,t),e=Object(a["a"])(this,Object(i["a"])(t).call(this,r)),e.isEnableWorkflow=!1,e.dataService=new p["default"],e.allViewMap=new Map,e.stateValue=0,e.stateField="",e.mainStateFields=[],e.allDeMainStateMap=new Map,e.initViewMap(),e.initDeMainStateMap(),e}return Object(s["a"])(t,e),Object(o["a"])(t,[{key:"initViewMap",value:function(){this.allViewMap.set(":",{viewname:"bdwpickupgridview",srfappde:"ormsignorgs"}),this.allViewMap.set(":",{viewname:"htqddwpickupgridview",srfappde:"ormsignorgs"}),this.allViewMap.set(":",{viewname:"bdwpickupview",srfappde:"ormsignorgs"}),this.allViewMap.set("PICKUPVIEW:",{viewname:"pickupview",srfappde:"ormsignorgs"}),this.allViewMap.set(":",{viewname:"pickupgridview",srfappde:"ormsignorgs"}),this.allViewMap.set(":",{viewname:"htqddwwpickupview",srfappde:"ormsignorgs"})}},{key:"initDeMainStateMap",value:function(){}},{key:"getRDAppView",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t,r){var n,a,i,s,c;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.isEnableWorkflow=r,e.next=3,this.dataService.Get({ormsignorg:t});case 3:if(n=e.sent,a=n.data,!0,i=!1,s=!1,!this.isEnableWorkflow){e.next=17;break}return e.next=11,this.dataService.testDataInWF({stateValue:this.stateValue,stateField:this.stateField},a);case 11:if(i=e.sent,!i){e.next=17;break}return i=!0,e.next=16,this.dataService.testUserExistWorklist(null,a);case 16:s=e.sent;case 17:return e.next=19,this.getDESDDEViewPDTParam(a,i,s);case 19:return c=e.sent,e.abrupt("return",this.allViewMap.get(c));case 21:case"end":return e.stop()}}),e,this)})));function t(t,r){return e.apply(this,arguments)}return t}()},{key:"getRealDEType",value:function(e){}},{key:"getDESDDEViewPDTParam",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t,r,n){var a,i,s;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if("",a=!1,i=null,!a||!i){e.next=9;break}if(s=t[i],u["a"].isAppMode){e.next=8;break}return e.abrupt("return","MOBEDITVIEW"+s);case 8:return e.abrupt("return","EDITVIEW"+s);case 9:if(u["a"].isAppMode){e.next=17;break}if(!this.getDEMainStateTag(t)){e.next=16;break}return e.t0="MOBEDITVIEW:MSTAG:",e.next=14,this.getDEMainStateTag(t);case 14:return e.t1=e.sent,e.abrupt("return",e.t0.concat.call(e.t0,e.t1));case 16:return e.abrupt("return","MOBEDITVIEW:");case 17:if(!this.getDEMainStateTag(t)){e.next=23;break}return e.t2="EDITVIEW:MSTAG:",e.next=21,this.getDEMainStateTag(t);case 21:return e.t3=e.sent,e.abrupt("return",e.t2.concat.call(e.t2,e.t3));case 23:return e.abrupt("return","EDITVIEW:");case 24:case"end":return e.stop()}}),e,this)})));function t(t,r,n){return e.apply(this,arguments)}return t}()},{key:"getDEMainStateTag",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t){var r,n,a,i,s,c;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(0!==this.mainStateFields.length){e.next=2;break}return e.abrupt("return",null);case 2:this.mainStateFields.forEach((function(e){e in t||console.error("当前数据对象不包含属性singleMainField，可能会发生错误")})),"",r=0;case 5:if(!(r<=1)){e.next=31;break}if(n=t[this.mainStateFields[0]]&&0==r?t[this.mainStateFields[0]]:"",!(this.mainStateFields.length>=2)){e.next=27;break}a=0;case 9:if(!(a<=1)){e.next=25;break}if(i=t[this.mainStateFields[1]]?"".concat(n,"__").concat(0==a?t[this.mainStateFields[1]]:""):n,!(this.mainStateFields.length>=3)){e.next=21;break}s=0;case 13:if(!(s<=1)){e.next=19;break}return c=t[this.mainStateFields[2]]?"".concat(i,"__").concat(0==s?t[this.mainStateFields[2]]:""):i,e.abrupt("return",this.allDeMainStateMap.get(c));case 16:s++,e.next=13;break;case 19:e.next=22;break;case 21:return e.abrupt("return",this.allDeMainStateMap.get(i));case 22:a++,e.next=9;break;case 25:e.next=28;break;case 27:return e.abrupt("return",this.allDeMainStateMap.get(n));case 28:r++,e.next=5;break;case 31:return e.abrupt("return",null);case 32:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}()}]),t}(g["a"]);r.d(t,"default",(function(){return f}));var f=function(e){function t(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,t),Object(a["a"])(this,Object(i["a"])(t).call(this,e))}return Object(s["a"])(t,e),t}(l)},bc11:function(e,t,r){"use strict";r.r(t);var n=r("d4ec"),a=r("99de"),i=r("7e84"),s=r("262e"),c=(r("4160"),r("2b19"),r("159b"),r("96cf"),r("1da1")),o=r("bee2"),u=r("d257"),g=r("ce95"),p=function(e){function t(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,t),Object(a["a"])(this,Object(i["a"])(t).call(this,e))}return Object(s["a"])(t,e),Object(o["a"])(t,[{key:"initBasicData",value:function(){this.APPLYDEKEY="ormsignorg",this.APPDEKEY="ormsignorgid",this.APPDENAME="ormsignorgs",this.APPDETEXT="ormsignorgname",this.APPNAME="ehrpim",this.SYSTEMNAME="ehr"}},{key:"Select",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=n.length>0&&void 0!==n[0]?n[0]:{},n.length>1&&void 0!==n[1]?n[1]:{},r=n.length>2?n[2]:void 0,e.abrupt("return",u["c"].getInstance().get("/ormsignorgs/".concat(t.ormsignorg,"/select"),r));case 4:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"CheckKey",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=a.length>0&&void 0!==a[0]?a[0]:{},r=a.length>1&&void 0!==a[1]?a[1]:{},n=a.length>2?a[2]:void 0,e.abrupt("return",u["c"].getInstance().post("/ormsignorgs/".concat(t.ormsignorg,"/checkkey"),r,n));case 4:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Update",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a,i,s,c=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=c.length>0&&void 0!==c[0]?c[0]:{},r=c.length>1&&void 0!==c[1]?c[1]:{},n=c.length>2?c[2]:void 0,a={},i=[],Object.is(this.tempStorage.getItem(t.srfsessionkey+"_pimcontractsignorgs"),"undefined")||(i=JSON.parse(this.tempStorage.getItem(t.srfsessionkey+"_pimcontractsignorgs")),i&&i.length&&i.length>0&&i.forEach((function(e){e.srffrontuf&&(Object.is(e.srffrontuf,"0")&&(e.contractsignorgid=null),delete e.srffrontuf)}))),a.pimcontractsignorgs=i,Object.assign(r,a),e.next=10,u["c"].getInstance().put("/ormsignorgs/".concat(t.ormsignorg),r,n);case 10:return s=e.sent,this.tempStorage.setItem(t.srfsessionkey+"_pimcontractsignorgs",JSON.stringify(s.data.pimcontractsignorgs)),e.abrupt("return",s);case 13:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Save",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a,i,s,c=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=c.length>0&&void 0!==c[0]?c[0]:{},r=c.length>1&&void 0!==c[1]?c[1]:{},n=c.length>2?c[2]:void 0,a={},i=[],Object.is(this.tempStorage.getItem(t.srfsessionkey+"_pimcontractsignorgs"),"undefined")||(i=JSON.parse(this.tempStorage.getItem(t.srfsessionkey+"_pimcontractsignorgs")),i&&i.length&&i.length>0&&i.forEach((function(e){e.srffrontuf&&(Object.is(e.srffrontuf,"0")&&(e.contractsignorgid=null),delete e.srffrontuf)}))),a.pimcontractsignorgs=i,Object.assign(r,a),e.next=10,u["c"].getInstance().post("/ormsignorgs/".concat(t.ormsignorg,"/save"),r,n);case 10:return s=e.sent,this.tempStorage.setItem(t.srfsessionkey+"_pimcontractsignorgs",JSON.stringify(s.data.pimcontractsignorgs)),e.abrupt("return",s);case 13:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()},{key:"GetDraft",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=i.length>0&&void 0!==i[0]?i[0]:{},r=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,e.next=5,u["c"].getInstance().get("/ormsignorgs/getdraft",n);case 5:return a=e.sent,a.data.ormsignorg=r.ormsignorg,this.tempStorage.setItem(t.srfsessionkey+"_pimcontractsignorgs",JSON.stringify(a.data.pimcontractsignorgs)),e.abrupt("return",a);case 9:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Get",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=a.length>0&&void 0!==a[0]?a[0]:{},a.length>1&&void 0!==a[1]?a[1]:{},r=a.length>2?a[2]:void 0,e.next=5,u["c"].getInstance().get("/ormsignorgs/".concat(t.ormsignorg),r);case 5:return n=e.sent,this.tempStorage.setItem(t.srfsessionkey+"_pimcontractsignorgs",JSON.stringify(n.data.pimcontractsignorgs)),e.abrupt("return",n);case 8:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Create",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a,i,s,c,o=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=o.length>0&&void 0!==o[0]?o[0]:{},r=o.length>1&&void 0!==o[1]?o[1]:{},n=o.length>2?o[2]:void 0,a={},i=[],Object.is(this.tempStorage.getItem(t.srfsessionkey+"_pimcontractsignorgs"),"undefined")||(i=JSON.parse(this.tempStorage.getItem(t.srfsessionkey+"_pimcontractsignorgs")),i&&i.length&&i.length>0&&i.forEach((function(e){e.srffrontuf&&(Object.is(e.srffrontuf,"0")&&(e.contractsignorgid=null),delete e.srffrontuf)}))),a.pimcontractsignorgs=i,Object.assign(r,a),r.srffrontuf&&"1"===r.srffrontuf||(r[this.APPDEKEY]=null),r.srffrontuf&&delete r.srffrontuf,s=JSON.parse(JSON.stringify(t)),e.next=13,u["c"].getInstance().post("/ormsignorgs",r,n);case 13:return c=e.sent,this.tempStorage.setItem(s.srfsessionkey+"_pimcontractsignorgs",JSON.stringify(c.data.pimcontractsignorgs)),e.abrupt("return",c);case 16:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Remove",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=n.length>0&&void 0!==n[0]?n[0]:{},n.length>1&&void 0!==n[1]?n[1]:{},r=n.length>2?n[2]:void 0,e.abrupt("return",u["c"].getInstance()["delete"]("/ormsignorgs/".concat(t.ormsignorg),r));case 4:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"FetchHTQDDW",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a.length>0&&void 0!==a[0]?a[0]:{},t=a.length>1&&void 0!==a[1]?a[1]:{},r=a.length>2?a[2]:void 0,n=JSON.parse(JSON.stringify(t)),e.abrupt("return",u["c"].getInstance().get("/ormsignorgs/fetchhtqddw",n,r));case 5:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"FetchDefault",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a.length>0&&void 0!==a[0]?a[0]:{},t=a.length>1&&void 0!==a[1]?a[1]:{},r=a.length>2?a[2]:void 0,n=JSON.parse(JSON.stringify(t)),e.abrupt("return",u["c"].getInstance().get("/ormsignorgs/fetchdefault",n,r));case 5:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"FetchCKBDWDFRZT",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a.length>0&&void 0!==a[0]?a[0]:{},t=a.length>1&&void 0!==a[1]?a[1]:{},r=a.length>2?a[2]:void 0,n=JSON.parse(JSON.stringify(t)),e.abrupt("return",u["c"].getInstance().get("/ormsignorgs/fetchckbdwdfrzt",n,r));case 5:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()}]),t}(g["a"]);r.d(t,"default",(function(){return l}));var l=function(e){function t(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,t),Object(a["a"])(this,Object(i["a"])(t).call(this,e))}return Object(s["a"])(t,e),t}(p)}}]);