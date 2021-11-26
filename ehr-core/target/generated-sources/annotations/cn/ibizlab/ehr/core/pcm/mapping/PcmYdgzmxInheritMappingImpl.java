package cn.ibizlab.ehr.core.pcm.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdgzmx;
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
public class PcmYdgzmxInheritMappingImpl implements PcmYdgzmxInheritMapping {

    @Override
    public PcmYdmx toPcmydmx(PcmYdgzmx pcmydgzmx) {
        if ( pcmydgzmx == null ) {
            return null;
        }

        PcmYdmx pcmYdmx = new PcmYdmx();

        pcmYdmx.setPcmydmxid( pcmydgzmx.getPcmydgzmxid() );
        pcmYdmx.setPcmydmxname( pcmydgzmx.getPcmydgzmxname() );
        Map<String, Object> map = pcmydgzmx.getExtensionparams();
        if ( map != null ) {
            pcmYdmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdmx.setFinished( pcmydgzmx.getFinished() );
        pcmYdmx.setYzw( pcmydgzmx.getYzw() );
        pcmYdmx.setPcmydmxtype( pcmydgzmx.getPcmydmxtype() );
        pcmYdmx.setYrank( pcmydgzmx.getYrank() );
        pcmYdmx.setSxrq( pcmydgzmx.getSxrq() );
        pcmYdmx.setCheckstatus( pcmydgzmx.getCheckstatus() );
        pcmYdmx.setYgw( pcmydgzmx.getYgw() );
        pcmYdmx.setYgbh( pcmydgzmx.getYgbh() );
        pcmYdmx.setZjhm( pcmydgzmx.getZjhm() );
        pcmYdmx.setZz( pcmydgzmx.getZz() );
        pcmYdmx.setCsrq( pcmydgzmx.getCsrq() );
        pcmYdmx.setLxdh( pcmydgzmx.getLxdh() );
        pcmYdmx.setNl( pcmydgzmx.getNl() );
        pcmYdmx.setBm( pcmydgzmx.getBm() );
        pcmYdmx.setPimpersonid( pcmydgzmx.getPimpersonid() );
        pcmYdmx.setZzid( pcmydgzmx.getZzid() );
        pcmYdmx.setBmid( pcmydgzmx.getBmid() );
        pcmYdmx.setCreatedate( pcmydgzmx.getCreatedate() );
        pcmYdmx.setCreateman( pcmydgzmx.getCreateman() );
        pcmYdmx.setUpdatedate( pcmydgzmx.getUpdatedate() );
        pcmYdmx.setUpdateman( pcmydgzmx.getUpdateman() );
        pcmYdmx.setPimpersonname( pcmydgzmx.getPimpersonname() );
        pcmYdmx.setZzdzs( pcmydgzmx.getZzdzs() );
        pcmYdmx.setShortname( pcmydgzmx.getShortname() );

        return pcmYdmx;
    }

    @Override
    public PcmYdgzmx toPcmydgzmx(PcmYdmx pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        PcmYdgzmx pcmYdgzmx = new PcmYdgzmx();

        pcmYdgzmx.setPcmydgzmxname( pcmydmx.getPcmydmxname() );
        pcmYdgzmx.setPcmydgzmxid( pcmydmx.getPcmydmxid() );
        Map<String, Object> map = pcmydmx.getExtensionparams();
        if ( map != null ) {
            pcmYdgzmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdgzmx.setCheckstatus( pcmydmx.getCheckstatus() );
        pcmYdgzmx.setZzid( pcmydmx.getZzid() );
        pcmYdgzmx.setPimpersonname( pcmydmx.getPimpersonname() );
        pcmYdgzmx.setBmid( pcmydmx.getBmid() );
        pcmYdgzmx.setCsrq( pcmydmx.getCsrq() );
        pcmYdgzmx.setLxdh( pcmydmx.getLxdh() );
        pcmYdgzmx.setYrank( pcmydmx.getYrank() );
        pcmYdgzmx.setZjhm( pcmydmx.getZjhm() );
        pcmYdgzmx.setPimpersonid( pcmydmx.getPimpersonid() );
        pcmYdgzmx.setUpdateman( pcmydmx.getUpdateman() );
        pcmYdgzmx.setZzdzs( pcmydmx.getZzdzs() );
        pcmYdgzmx.setCreateman( pcmydmx.getCreateman() );
        pcmYdgzmx.setSxrq( pcmydmx.getSxrq() );
        pcmYdgzmx.setYgw( pcmydmx.getYgw() );
        pcmYdgzmx.setFinished( pcmydmx.getFinished() );
        pcmYdgzmx.setShortname( pcmydmx.getShortname() );
        pcmYdgzmx.setPcmydmxtype( pcmydmx.getPcmydmxtype() );
        pcmYdgzmx.setCreatedate( pcmydmx.getCreatedate() );
        pcmYdgzmx.setBm( pcmydmx.getBm() );
        pcmYdgzmx.setYgbh( pcmydmx.getYgbh() );
        pcmYdgzmx.setZz( pcmydmx.getZz() );
        pcmYdgzmx.setNl( pcmydmx.getNl() );
        pcmYdgzmx.setUpdatedate( pcmydmx.getUpdatedate() );
        pcmYdgzmx.setYzw( pcmydmx.getYzw() );

        return pcmYdgzmx;
    }

    @Override
    public List<PcmYdmx> toPcmydmx(List<PcmYdgzmx> pcmydgzmx) {
        if ( pcmydgzmx == null ) {
            return null;
        }

        List<PcmYdmx> list = new ArrayList<PcmYdmx>( pcmydgzmx.size() );
        for ( PcmYdgzmx pcmYdgzmx : pcmydgzmx ) {
            list.add( toPcmydmx( pcmYdgzmx ) );
        }

        return list;
    }

    @Override
    public List<PcmYdgzmx> toPcmydgzmx(List<PcmYdmx> pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        List<PcmYdgzmx> list = new ArrayList<PcmYdgzmx>( pcmydmx.size() );
        for ( PcmYdmx pcmYdmx : pcmydmx ) {
            list.add( toPcmydgzmx( pcmYdmx ) );
        }

        return list;
    }
}
