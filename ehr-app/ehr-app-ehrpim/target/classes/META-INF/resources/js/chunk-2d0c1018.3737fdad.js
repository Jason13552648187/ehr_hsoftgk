(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0c1018"],{"43cf":function(e,t,n){"use strict";n.r(t);var r=n("d4ec"),a=n("99de"),i=n("7e84"),c=n("262e"),o=(n("99af"),n("96cf"),n("1da1")),u=n("bee2"),p=n("d257"),s=n("ce95"),v=function(e){function t(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(r["a"])(this,t),Object(a["a"])(this,Object(i["a"])(t).call(this,e))}return Object(c["a"])(t,e),Object(u["a"])(t,[{key:"initBasicData",value:function(){this.APPLYDEKEY="pimvacation",this.APPDEKEY="pimvacationid",this.APPDENAME="pimvacations",this.APPDETEXT="pimvacationname",this.APPNAME="ehrpim",this.SYSTEMNAME="ehr"}},{key:"Select",value:function(){var e=Object(o["a"])(regeneratorRuntime.mark((function e(){var t,n,r=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=r.length>0&&void 0!==r[0]?r[0]:{},r.length>1&&void 0!==r[1]?r[1]:{},n=r.length>2?r[2]:void 0,!t.pimperson||!t.pimvacation){e.next=5;break}return e.abrupt("return",p["c"].getInstance().get("/pimpeople/".concat(t.pimperson,"/pimvacations/").concat(t.pimvacation,"/select"),n));case 5:return e.abrupt("return",p["c"].getInstance().get("/pimvacations/".concat(t.pimvacation,"/select"),n));case 6:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Update",value:function(){var e=Object(o["a"])(regeneratorRuntime.mark((function e(){var t,n,r,a,i,c=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=c.length>0&&void 0!==c[0]?c[0]:{},n=c.length>1&&void 0!==c[1]?c[1]:{},r=c.length>2?c[2]:void 0,!t.pimperson||!t.pimvacation){e.next=5;break}return e.abrupt("return",p["c"].getInstance().put("/pimpeople/".concat(t.pimperson,"/pimvacations/").concat(t.pimvacation),n,r));case 5:return a={},Object.assign(n,a),e.next=9,p["c"].getInstance().put("/pimvacations/".concat(t.pimvacation),n,r);case 9:return i=e.sent,e.abrupt("return",i);case 11:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Remove",value:function(){var e=Object(o["a"])(regeneratorRuntime.mark((function e(){var t,n,r=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=r.length>0&&void 0!==r[0]?r[0]:{},r.length>1&&void 0!==r[1]?r[1]:{},n=r.length>2?r[2]:void 0,!t.pimperson||!t.pimvacation){e.next=5;break}return e.abrupt("return",p["c"].getInstance()["delete"]("/pimpeople/".concat(t.pimperson,"/pimvacations/").concat(t.pimvacation),n));case 5:return e.abrupt("return",p["c"].getInstance()["delete"]("/pimvacations/".concat(t.pimvacation),n));case 6:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"GetDraft",value:function(){var e=Object(o["a"])(regeneratorRuntime.mark((function e(){var t,n,r,a,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=i.length>0&&void 0!==i[0]?i[0]:{},n=i.length>1&&void 0!==i[1]?i[1]:{},r=i.length>2?i[2]:void 0,!t.pimperson){e.next=5;break}return e.abrupt("return",p["c"].getInstance().get("/pimpeople/".concat(t.pimperson,"/pimvacations/getdraft"),r));case 5:return e.next=7,p["c"].getInstance().get("/pimvacations/getdraft",r);case 7:return a=e.sent,a.data.pimvacation=n.pimvacation,e.abrupt("return",a);case 10:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Save",value:function(){var e=Object(o["a"])(regeneratorRuntime.mark((function e(){var t,n,r,a,i,c=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=c.length>0&&void 0!==c[0]?c[0]:{},n=c.length>1&&void 0!==c[1]?c[1]:{},r=c.length>2?c[2]:void 0,!t.pimperson||!t.pimvacation){e.next=5;break}return e.abrupt("return",p["c"].getInstance().post("/pimpeople/".concat(t.pimperson,"/pimvacations/").concat(t.pimvacation,"/save"),n,r));case 5:return a={},Object.assign(n,a),e.next=9,p["c"].getInstance().post("/pimvacations/".concat(t.pimvacation,"/save"),n,r);case 9:return i=e.sent,e.abrupt("return",i);case 11:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Create",value:function(){var e=Object(o["a"])(regeneratorRuntime.mark((function e(){var t,n,r,a,i,c=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=c.length>0&&void 0!==c[0]?c[0]:{},n=c.length>1&&void 0!==c[1]?c[1]:{},r=c.length>2?c[2]:void 0,!t.pimperson){e.next=7;break}return n.srffrontuf&&"1"===n.srffrontuf||(n[this.APPDEKEY]=null),n.srffrontuf&&delete n.srffrontuf,e.abrupt("return",p["c"].getInstance().post("/pimpeople/".concat(t.pimperson,"/pimvacations"),n,r));case 7:return a={},Object.assign(n,a),n.srffrontuf&&"1"===n.srffrontuf||(n[this.APPDEKEY]=null),n.srffrontuf&&delete n.srffrontuf,JSON.parse(JSON.stringify(t)),e.next=14,p["c"].getInstance().post("/pimvacations",n,r);case 14:return i=e.sent,e.abrupt("return",i);case 16:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()},{key:"CheckKey",value:function(){var e=Object(o["a"])(regeneratorRuntime.mark((function e(){var t,n,r,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=a.length>0&&void 0!==a[0]?a[0]:{},n=a.length>1&&void 0!==a[1]?a[1]:{},r=a.length>2?a[2]:void 0,!t.pimperson||!t.pimvacation){e.next=5;break}return e.abrupt("return",p["c"].getInstance().post("/pimpeople/".concat(t.pimperson,"/pimvacations/").concat(t.pimvacation,"/checkkey"),n,r));case 5:return e.abrupt("return",p["c"].getInstance().post("/pimvacations/".concat(t.pimvacation,"/checkkey"),n,r));case 6:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Get",value:function(){var e=Object(o["a"])(regeneratorRuntime.mark((function e(){var t,n,r,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=a.length>0&&void 0!==a[0]?a[0]:{},a.length>1&&void 0!==a[1]?a[1]:{},n=a.length>2?a[2]:void 0,!t.pimperson||!t.pimvacation){e.next=5;break}return e.abrupt("return",p["c"].getInstance().get("/pimpeople/".concat(t.pimperson,"/pimvacations/").concat(t.pimvacation),n));case 5:return e.next=7,p["c"].getInstance().get("/pimvacations/".concat(t.pimvacation),n);case 7:return r=e.sent,e.abrupt("return",r);case 9:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"FetchDefault",value:function(){var e=Object(o["a"])(regeneratorRuntime.mark((function e(){var t,n,r,a,i,c=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=c.length>0&&void 0!==c[0]?c[0]:{},n=c.length>1&&void 0!==c[1]?c[1]:{},r=c.length>2?c[2]:void 0,!t.pimperson){e.next=6;break}return a=JSON.parse(JSON.stringify(n)),e.abrupt("return",p["c"].getInstance().get("/pimpeople/".concat(t.pimperson,"/pimvacations/fetchdefault"),a,r));case 6:return i=JSON.parse(JSON.stringify(n)),e.abrupt("return",p["c"].getInstance().get("/pimvacations/fetchdefault",i,r));case 8:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()}]),t}(s["a"]);n.d(t,"default",(function(){return m}));var m=function(e){function t(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(r["a"])(this,t),Object(a["a"])(this,Object(i["a"])(t).call(this,e))}return Object(c["a"])(t,e),t}(v)}}]);