package cn.ibizlab.ehr.core.pcm.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdbxmx;
import cn.ibizlab.ehr.core.pcm.domain.PcmYdmx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-18T11:09:12+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYdbxmxInheritMappingImpl implements PcmYdbxmxInheritMapping {

    @Override
    public PcmYdmx toPcmydmx(PcmYdbxmx pcmydbxmx) {
        if ( pcmydbxmx == null ) {
            return null;
        }

        PcmYdmx pcmYdmx = new PcmYdmx();

        pcmYdmx.setPcmydmxid( pcmydbxmx.getPcmydbxmxid() );
        pcmYdmx.setPcmydmxname( pcmydbxmx.getPcmydbxmxname() );
        Map<String, Object> map = pcmydbxmx.getExtensionparams();
        if ( map != null ) {
            pcmYdmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdmx.setYzw( pcmydbxmx.getYzw() );
        pcmYdmx.setPcmydmxtype( pcmydbxmx.getPcmydmxtype() );
        pcmYdmx.setYrank( pcmydbxmx.getYrank() );
        pcmYdmx.setSxrq( pcmydbxmx.getSxrq() );
        pcmYdmx.setCheckstatus( pcmydbxmx.getCheckstatus() );
        pcmYdmx.setYgw( pcmydbxmx.getYgw() );
        pcmYdmx.setYgbh( pcmydbxmx.getYgbh() );
        pcmYdmx.setZjhm( pcmydbxmx.getZjhm() );
        pcmYdmx.setZz( pcmydbxmx.getZz() );
        pcmYdmx.setCsrq( pcmydbxmx.getCsrq() );
        pcmYdmx.setLxdh( pcmydbxmx.getLxdh() );
        pcmYdmx.setNl( pcmydbxmx.getNl() );
        pcmYdmx.setBm( pcmydbxmx.getBm() );
        pcmYdmx.setPimpersonid( pcmydbxmx.getPimpersonid() );
        pcmYdmx.setZzid( pcmydbxmx.getZzid() );
        pcmYdmx.setBmid( pcmydbxmx.getBmid() );
        pcmYdmx.setCreatedate( pcmydbxmx.getCreatedate() );
        pcmYdmx.setCreateman( pcmydbxmx.getCreateman() );
        pcmYdmx.setUpdatedate( pcmydbxmx.getUpdatedate() );
        pcmYdmx.setUpdateman( pcmydbxmx.getUpdateman() );
        pcmYdmx.setPimpersonname( pcmydbxmx.getPimpersonname() );
        pcmYdmx.setZzdzs( pcmydbxmx.getZzdzs() );
        pcmYdmx.setShortname( pcmydbxmx.getShortname() );

        return pcmYdmx;
    }

    @Override
    public PcmYdbxmx toPcmydbxmx(PcmYdmx pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        PcmYdbxmx pcmYdbxmx = new PcmYdbxmx();

        pcmYdbxmx.setPcmydbxmxname( pcmydmx.getPcmydmxname() );
        pcmYdbxmx.setPcmydbxmxid( pcmydmx.getPcmydmxid() );
        Map<String, Object> map = pcmydmx.getExtensionparams();
        if ( map != null ) {
            pcmYdbxmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdbxmx.setZjhm( pcmydmx.getZjhm() );
        pcmYdbxmx.setUpdatedate( pcmydmx.getUpdatedate() );
        pcmYdbxmx.setYgbh( pcmydmx.getYgbh() );
        pcmYdbxmx.setYrank( pcmydmx.getYrank() );
        pcmYdbxmx.setZzid( pcmydmx.getZzid() );
        pcmYdbxmx.setYgw( pcmydmx.getYgw() );
        pcmYdbxmx.setUpdateman( pcmydmx.getUpdateman() );
        pcmYdbxmx.setLxdh( pcmydmx.getLxdh() );
        pcmYdbxmx.setBmid( pcmydmx.getBmid() );
        pcmYdbxmx.setBm( pcmydmx.getBm() );
        pcmYdbxmx.setCheckstatus( pcmydmx.getCheckstatus() );
        pcmYdbxmx.setZzdzs( pcmydmx.getZzdzs() );
        pcmYdbxmx.setPcmydmxtype( pcmydmx.getPcmydmxtype() );
        pcmYdbxmx.setCsrq( pcmydmx.getCsrq() );
        pcmYdbxmx.setCreateman( pcmydmx.getCreateman() );
        pcmYdbxmx.setSxrq( pcmydmx.getSxrq() );
        pcmYdbxmx.setPimpersonid( pcmydmx.getPimpersonid() );
        pcmYdbxmx.setYzw( pcmydmx.getYzw() );
        pcmYdbxmx.setCreatedate( pcmydmx.getCreatedate() );
        pcmYdbxmx.setZz( pcmydmx.getZz() );
        pcmYdbxmx.setShortname( pcmydmx.getShortname() );
        pcmYdbxmx.setNl( pcmydmx.getNl() );
        pcmYdbxmx.setPimpersonname( pcmydmx.getPimpersonname() );

        return pcmYdbxmx;
    }

    @Override
    public List<PcmYdmx> toPcmydmx(List<PcmYdbxmx> pcmydbxmx) {
        if ( pcmydbxmx == null ) {
            return null;
        }

        List<PcmYdmx> list = new ArrayList<PcmYdmx>( pcmydbxmx.size() );
        for ( PcmYdbxmx pcmYdbxmx : pcmydbxmx ) {
            list.add( toPcmydmx( pcmYdbxmx ) );
        }

        return list;
    }

    @Override
    public List<PcmYdbxmx> toPcmydbxmx(List<PcmYdmx> pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        List<PcmYdbxmx> list = new ArrayList<PcmYdbxmx>( pcmydmx.size() );
        for ( PcmYdmx pcmYdmx : pcmydmx ) {
            list.add( toPcmydbxmx( pcmYdmx ) );
        }

        return list;
    }
}
