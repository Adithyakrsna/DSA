var TimeLimitedCache=function(){
    this.cache=new Map();
};
TimeLimitedCache.prototype.set=function(key,value,duration){
    const now=Date.now();
    const existed=this.cache.has(key)&&this.cache.get(key).expiry>now;
    this.cache.set(key,{value:value,expiry:now+duration});
    return existed;
};
TimeLimitedCache.prototype.get=function(key){
    const now=Date.now();
    const e=this.cache.get(key);
    if(!e)return-1;
    if(e.expiry<now){this.cache.delete(key);return-1;}
    return e.value;
};
TimeLimitedCache.prototype.count=function(){
    const now=Date.now();
    let c=0;
    for(const[k,e]of this.cache){
        if(e.expiry>now)c++;else this.cache.delete(k);
    }
    return c;
};
