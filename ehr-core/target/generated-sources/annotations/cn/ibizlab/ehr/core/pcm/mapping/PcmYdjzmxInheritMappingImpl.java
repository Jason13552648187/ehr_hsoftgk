package cn.ibizlab.ehr.core.pcm.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdjzmx;
import cn.ibizlab.ehr.core.pcm.domain.PcmYdmx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-18T11:09:13+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYdjzmxInheritMappingImpl implements PcmYdjzmxInheritMapping {

    @Override
    public PcmYdmx toPcmydmx(PcmYdjzmx pcmydjzmx) {
        if ( pcmydjzmx == null ) {
            return null;
        }

        PcmYdmx pcmYdmx = new PcmYdmx();

        pcmYdmx.setPcmydmxid( pcmydjzmx.getPcmydjzmxid() );
        pcmYdmx.setPcmydmxname( pcmydjzmx.getPcmydjzmxname() );
        Map<String, Object> map = pcmydjzmx.getExtensionparams();
        if ( map != null ) {
            pcmYdmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdmx.setYzw( pcmydjzmx.getYzw() );
        pcmYdmx.setPcmydmxtype( pcmydjzmx.getPcmydmxtype() );
        pcmYdmx.setYrank( pcmydjzmx.getYrank() );
        pcmYdmx.setSxrq( pcmydjzmx.getSxrq() );
        pcmYdmx.setCheckstatus( pcmydjzmx.getCheckstatus() );
        pcmYdmx.setYgw( pcmydjzmx.getYgw() );
        pcmYdmx.setYgbh( pcmydjzmx.getYgbh() );
        pcmYdmx.setZjhm( pcmydjzmx.getZjhm() );
        pcmYdmx.setZz( pcmydjzmx.getZz() );
        pcmYdmx.setCsrq( pcmydjzmx.getCsrq() );
        pcmYdmx.setLxdh( pcmydjzmx.getLxdh() );
        pcmYdmx.setNl( pcmydjzmx.getNl() );
        pcmYdmx.setBm( pcmydjzmx.getBm() );
        pcmYdmx.setPimpersonid( pcmydjzmx.getPimpersonid() );
        pcmYdmx.setZzid( pcmydjzmx.getZzid() );
        pcmYdmx.setBmid( pcmydjzmx.getBmid() );
        pcmYdmx.setCreatedate( pcmydjzmx.getCreatedate() );
        pcmYdmx.setCreateman( pcmydjzmx.getCreateman() );
        pcmYdmx.setUpdatedate( pcmydjzmx.getUpdatedate() );
        pcmYdmx.setUpdateman( pcmydjzmx.getUpdateman() );
        pcmYdmx.setPimpersonname( pcmydjzmx.getPimpersonname() );
        pcmYdmx.setZzdzs( pcmydjzmx.getZzdzs() );
        pcmYdmx.setShortname( pcmydjzmx.getShortname() );

        return pcmYdmx;
    }

    @Override
    public PcmYdjzmx toPcmydjzmx(PcmYdmx pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        PcmYdjzmx pcmYdjzmx = new PcmYdjzmx();

        pcmYdjzmx.setPcmydjzmxname( pcmydmx.getPcmydmxname() );
        pcmYdjzmx.setPcmydjzmxid( pcmydmx.getPcmydmxid() );
        Map<String, Object> map = pcmydmx.getExtensionparams();
        if ( map != null ) {
            pcmYdjzmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdjzmx.setBm( pcmydmx.getBm() );
        pcmYdjzmx.setZzid( pcmydmx.getZzid() );
        pcmYdjzmx.setSxrq( pcmydmx.getSxrq() );
        pcmYdjzmx.setBmid( pcmydmx.getBmid() );
        pcmYdjzmx.setUpdateman( pcmydmx.getUpdateman() );
        pcmYdjzmx.setUpdatedate( pcmydmx.getUpdatedate() );
        pcmYdjzmx.setYzw( pcmydmx.getYzw() );
        pcmYdjzmx.setYrank( pcmydmx.getYrank() );
        pcmYdjzmx.setNl( pcmydmx.getNl() );
        pcmYdjzmx.setZz( pcmydmx.getZz() );
        pcmYdjzmx.setZzdzs( pcmydmx.getZzdzs() );
        pcmYdjzmx.setShortname( pcmydmx.getShortname() );
        pcmYdjzmx.setYgw( pcmydmx.getYgw() );
        pcmYdjzmx.setZjhm( pcmydmx.getZjhm() );
        pcmYdjzmx.setCsrq( pcmydmx.getCsrq() );
        pcmYdjzmx.setCreatedate( pcmydmx.getCreatedate() );
        pcmYdjzmx.setPimpersonname( pcmydmx.getPimpersonname() );
        pcmYdjzmx.setCreateman( pcmydmx.getCreateman() );
        pcmYdjzmx.setCheckstatus( pcmydmx.getCheckstatus() );
        pcmYdjzmx.setPimpersonid( pcmydmx.getPimpersonid() );
        pcmYdjzmx.setLxdh( pcmydmx.getLxdh() );
        pcmYdjzmx.setPcmydmxtype( pcmydmx.getPcmydmxtype() );
        pcmYdjzmx.setYgbh( pcmydmx.getYgbh() );

        return pcmYdjzmx;
    }

    @Override
    public List<PcmYdmx> toPcmydmx(List<PcmYdjzmx> pcmydjzmx) {
        if ( pcmydjzmx == null ) {
            return null;
        }

        List<PcmYdmx> list = new ArrayList<PcmYdmx>( pcmydjzmx.size() );
        for ( PcmYdjzmx pcmYdjzmx : pcmydjzmx ) {
            list.add( toPcmydmx( pcmYdjzmx ) );
        }

        return list;
    }

    @Override
    public List<PcmYdjzmx> toPcmydjzmx(List<PcmYdmx> pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        List<PcmYdjzmx> list = new ArrayList<PcmYdjzmx>( pcmydmx.size() );
        for ( PcmYdmx pcmYdmx : pcmydmx ) {
            list.add( toPcmydjzmx( pcmYdmx ) );
        }

        return list;
    }
}
