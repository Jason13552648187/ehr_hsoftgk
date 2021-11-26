package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdtxmx;
import cn.ibizlab.ehr.webapi.dto.PcmYdtxmxDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYdtxmxMappingImpl implements PcmYdtxmxMapping {

    @Override
    public PcmYdtxmx toDomain(PcmYdtxmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmYdtxmx pcmYdtxmx = new PcmYdtxmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmYdtxmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmYdtxmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getRetiplace() != null ) {
            pcmYdtxmx.setRetiplace( dto.getRetiplace() );
        }
        if ( dto.getPcmydtxmxname() != null ) {
            pcmYdtxmx.setPcmydtxmxname( dto.getPcmydtxmxname() );
        }
        if ( dto.getPcmydbxmxname() != null ) {
            pcmYdtxmx.setPcmydbxmxname( dto.getPcmydbxmxname() );
        }
        if ( dto.getJsrq() != null ) {
            pcmYdtxmx.setJsrq( dto.getJsrq() );
        }
        if ( dto.getPcmydbxmxid() != null ) {
            pcmYdtxmx.setPcmydbxmxid( dto.getPcmydbxmxid() );
        }
        if ( dto.getReason() != null ) {
            pcmYdtxmx.setReason( dto.getReason() );
        }
        if ( dto.getBz() != null ) {
            pcmYdtxmx.setBz( dto.getBz() );
        }
        if ( dto.getShortname() != null ) {
            pcmYdtxmx.setShortname( dto.getShortname() );
        }
        if ( dto.getYzw() != null ) {
            pcmYdtxmx.setYzw( dto.getYzw() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmYdtxmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrgid() != null ) {
            pcmYdtxmx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmYdtxmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmYdtxmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getPcmydtxmxid() != null ) {
            pcmYdtxmx.setPcmydtxmxid( dto.getPcmydtxmxid() );
        }
        if ( dto.getYgbh() != null ) {
            pcmYdtxmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmYdtxmx.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getFinished() != null ) {
            pcmYdtxmx.setFinished( dto.getFinished() );
        }
        if ( dto.getLxdh() != null ) {
            pcmYdtxmx.setLxdh( dto.getLxdh() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmYdtxmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPcmydmxtype() != null ) {
            pcmYdtxmx.setPcmydmxtype( dto.getPcmydmxtype() );
        }
        if ( dto.getYrank() != null ) {
            pcmYdtxmx.setYrank( dto.getYrank() );
        }
        if ( dto.getSxrq() != null ) {
            pcmYdtxmx.setSxrq( dto.getSxrq() );
        }
        if ( dto.getBmid() != null ) {
            pcmYdtxmx.setBmid( dto.getBmid() );
        }
        if ( dto.getNj() != null ) {
            pcmYdtxmx.setNj( dto.getNj() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmYdtxmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getZjhm() != null ) {
            pcmYdtxmx.setZjhm( dto.getZjhm() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmYdtxmx.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmYdtxmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getYgw() != null ) {
            pcmYdtxmx.setYgw( dto.getYgw() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmYdtxmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getBm() != null ) {
            pcmYdtxmx.setBm( dto.getBm() );
        }
        if ( dto.getCsrq() != null ) {
            pcmYdtxmx.setCsrq( dto.getCsrq() );
        }
        if ( dto.getZzid() != null ) {
            pcmYdtxmx.setZzid( dto.getZzid() );
        }
        if ( dto.getNl() != null ) {
            pcmYdtxmx.setNl( dto.getNl() );
        }
        if ( dto.getZz() != null ) {
            pcmYdtxmx.setZz( dto.getZz() );
        }

        return pcmYdtxmx;
    }

    @Override
    public PcmYdtxmxDTO toDto(PcmYdtxmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmYdtxmxDTO pcmYdtxmxDTO = new PcmYdtxmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmYdtxmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmYdtxmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getRetiplace() != null ) {
            pcmYdtxmxDTO.setRetiplace( entity.getRetiplace() );
        }
        if ( entity.getPcmydtxmxname() != null ) {
            pcmYdtxmxDTO.setPcmydtxmxname( entity.getPcmydtxmxname() );
        }
        if ( entity.getPcmydbxmxname() != null ) {
            pcmYdtxmxDTO.setPcmydbxmxname( entity.getPcmydbxmxname() );
        }
        if ( entity.getJsrq() != null ) {
            pcmYdtxmxDTO.setJsrq( entity.getJsrq() );
        }
        if ( entity.getPcmydbxmxid() != null ) {
            pcmYdtxmxDTO.setPcmydbxmxid( entity.getPcmydbxmxid() );
        }
        if ( entity.getReason() != null ) {
            pcmYdtxmxDTO.setReason( entity.getReason() );
        }
        if ( entity.getBz() != null ) {
            pcmYdtxmxDTO.setBz( entity.getBz() );
        }
        if ( entity.getShortname() != null ) {
            pcmYdtxmxDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getYzw() != null ) {
            pcmYdtxmxDTO.setYzw( entity.getYzw() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmYdtxmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrgid() != null ) {
            pcmYdtxmxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmYdtxmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmYdtxmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getPcmydtxmxid() != null ) {
            pcmYdtxmxDTO.setPcmydtxmxid( entity.getPcmydtxmxid() );
        }
        if ( entity.getYgbh() != null ) {
            pcmYdtxmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmYdtxmxDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getFinished() != null ) {
            pcmYdtxmxDTO.setFinished( entity.getFinished() );
        }
        if ( entity.getLxdh() != null ) {
            pcmYdtxmxDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmYdtxmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPcmydmxtype() != null ) {
            pcmYdtxmxDTO.setPcmydmxtype( entity.getPcmydmxtype() );
        }
        if ( entity.getYrank() != null ) {
            pcmYdtxmxDTO.setYrank( entity.getYrank() );
        }
        if ( entity.getSxrq() != null ) {
            pcmYdtxmxDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getBmid() != null ) {
            pcmYdtxmxDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getNj() != null ) {
            pcmYdtxmxDTO.setNj( entity.getNj() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmYdtxmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getZjhm() != null ) {
            pcmYdtxmxDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmYdtxmxDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmYdtxmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getYgw() != null ) {
            pcmYdtxmxDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmYdtxmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getBm() != null ) {
            pcmYdtxmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getCsrq() != null ) {
            pcmYdtxmxDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getZzid() != null ) {
            pcmYdtxmxDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getNl() != null ) {
            pcmYdtxmxDTO.setNl( entity.getNl() );
        }
        if ( entity.getZz() != null ) {
            pcmYdtxmxDTO.setZz( entity.getZz() );
        }

        return pcmYdtxmxDTO;
    }

    @Override
    public List<PcmYdtxmx> toDomain(List<PcmYdtxmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmYdtxmx> list = new ArrayList<PcmYdtxmx>( dtoList.size() );
        for ( PcmYdtxmxDTO pcmYdtxmxDTO : dtoList ) {
            list.add( toDomain( pcmYdtxmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmYdtxmxDTO> toDto(List<PcmYdtxmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmYdtxmxDTO> list = new ArrayList<PcmYdtxmxDTO>( entityList.size() );
        for ( PcmYdtxmx pcmYdtxmx : entityList ) {
            list.add( toDto( pcmYdtxmx ) );
        }

        return list;
    }
}
