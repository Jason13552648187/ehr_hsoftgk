(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-47c0779d"],{4765:function(e,t,i){"use strict";i.d(t,"a",(function(){return r}));var n=i("d4ec"),a=i("bee2"),r=function(){function e(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};Object(n["a"])(this,e),this.$store=null,this.$store=t.$store}return Object(a["a"])(e,[{key:"getStore",value:function(){return this.$store}},{key:"getService",value:function(e){return window["uiServiceRegister"].getService(e)}}]),e}()},"944b":function(e,t,i){"use strict";var n=i("e66d"),a=i.n(n);a.a},"9ae0":function(e,t,i){"use strict";i.r(t);var n=i("d4ec"),a=i("99de"),r=i("7e84"),c=i("262e"),s=i("9ab4"),o=i("60a3"),u=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("div",{staticClass:"view-container deredirectview pimarchivesredirect-view"},[i("app-studioaction",{attrs:{viewTitle:e.$t(e.model.srfTitle),viewName:"pimarchivesredirectview"}})],1)},v=[],l=(i("99af"),i("4160"),i("b64b"),i("2ca0"),i("159b"),i("96cf"),i("1da1")),f=i("bee2"),d=i("2bd2"),p=i("46aa"),w=i("cdfd"),h=i("4765"),b=function(e){function t(){var e;return Object(n["a"])(this,t),e=Object(a["a"])(this,Object(r["a"])(t).apply(this,arguments)),e.appEntityService=new w["default"],e.counterServiceArray=[],e.viewtag="21ccd254338305d40bc75d2c4fb6cd3f",e.srfparentdata={},e.customViewNavContexts={},e.customViewParams={},e.model={srfCaption:"entities.pimarchives.views.redirectview.caption",srfTitle:"entities.pimarchives.views.redirectview.title",srfSubTitle:"entities.pimarchives.views.redirectview.subtitle",dataInfo:""},e.containerModel={},e.viewState=new d["a"],e}return Object(c["a"])(t,e),Object(f["a"])(t,[{key:"viewDatasChange",value:function(e){return e}},{key:"engineInit",value:function(){}},{key:"destroyed",value:function(){var e=this;if(this.viewDefaultUsage){var t=Object.keys(localStorage);t.length>0&&t.forEach((function(t){t.startsWith(e.context.srfsessionid)&&localStorage.removeItem(t)}))}}},{key:"viewInit",value:function(){var e=Object(l["a"])(regeneratorRuntime.mark((function e(){var t,i,n,a,r,c=this;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=this.viewparams,i=t.srfkey,n=t.srfappde,a=new h["a"],e.next=4,a.getService(n.toLowerCase());case 4:r=e.sent,r.getRDAppView(i,!0).then((function(e){if(e&&e.viewname&&e.srfappde){var t="/".concat(e.srfappde,"/").concat(i,"/").concat(e.viewname);c.$router.push({path:t})}else console.error("未查找到重定向视图")}));case 6:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()}]),t}(p["r"]);s["a"]([Object(o["b"])()],b.prototype,"viewDatasChange",null),b=s["a"]([Object(o["a"])({}),p["q"]],b);var m=b,g=m,j=(i("944b"),i("2877")),O=Object(j["a"])(g,u,v,!1,null,null,null),y=O.exports,k=function(e){function t(){return Object(n["a"])(this,t),Object(a["a"])(this,Object(r["a"])(t).apply(this,arguments))}return Object(c["a"])(t,e),t}(y);k=s["a"]([Object(o["a"])({components:{},beforeRouteEnter:function(e,t,i){i((function(t){t.$store.commit("addCurPageViewtag",{fullPath:e.fullPath,viewtag:t.viewtag})}))}})],k);var S,$,C=k,x=C,R=Object(j["a"])(x,S,$,!1,null,null,null);t["default"]=R.exports},e66d:function(e,t,i){}}]);