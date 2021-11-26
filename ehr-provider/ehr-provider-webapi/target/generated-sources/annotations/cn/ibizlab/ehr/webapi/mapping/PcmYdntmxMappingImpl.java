package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdntmx;
import cn.ibizlab.ehr.webapi.dto.PcmYdntmxDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYdntmxMappingImpl implements PcmYdntmxMapping {

    @Override
    public PcmYdntmx toDomain(PcmYdntmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmYdntmx pcmYdntmx = new PcmYdntmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmYdntmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmYdntmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDistirbutionid() != null ) {
            pcmYdntmx.setDistirbutionid( dto.getDistirbutionid() );
        }
        if ( dto.getPcmydntmxname() != null ) {
            pcmYdntmx.setPcmydntmxname( dto.getPcmydntmxname() );
        }
        if ( dto.getJsrq() != null ) {
            pcmYdntmx.setJsrq( dto.getJsrq() );
        }
        if ( dto.getBz() != null ) {
            pcmYdntmx.setBz( dto.getBz() );
        }
        if ( dto.getCz() != null ) {
            pcmYdntmx.setCz( dto.getCz() );
        }
        if ( dto.getReason() != null ) {
            pcmYdntmx.setReason( dto.getReason() );
        }
        if ( dto.getIsfinished() != null ) {
            pcmYdntmx.setIsfinished( dto.getIsfinished() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmYdntmx.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getSxrq() != null ) {
            pcmYdntmx.setSxrq( dto.getSxrq() );
        }
        if ( dto.getBmid() != null ) {
            pcmYdntmx.setBmid( dto.getBmid() );
        }
        if ( dto.getYzw() != null ) {
            pcmYdntmx.setYzw( dto.getYzw() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmYdntmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pcmYdntmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmYdntmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getZzid() != null ) {
            pcmYdntmx.setZzid( dto.getZzid() );
        }
        if ( dto.getLxdh() != null ) {
            pcmYdntmx.setLxdh( dto.getLxdh() );
        }
        if ( dto.getZjhm() != null ) {
            pcmYdntmx.setZjhm( dto.getZjhm() );
        }
        if ( dto.getYgbh() != null ) {
            pcmYdntmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmYdntmx.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmYdntmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmYdntmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getZz() != null ) {
            pcmYdntmx.setZz( dto.getZz() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmYdntmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getNl() != null ) {
            pcmYdntmx.setNl( dto.getNl() );
        }
        if ( dto.getYrank() != null ) {
            pcmYdntmx.setYrank( dto.getYrank() );
        }
        if ( dto.getBm() != null ) {
            pcmYdntmx.setBm( dto.getBm() );
        }
        if ( dto.getPcmydmxtype() != null ) {
            pcmYdntmx.setPcmydmxtype( dto.getPcmydmxtype() );
        }
        if ( dto.getOrgid() != null ) {
            pcmYdntmx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getCsrq() != null ) {
            pcmYdntmx.setCsrq( dto.getCsrq() );
        }
        if ( dto.getPcmydntmxid() != null ) {
            pcmYdntmx.setPcmydntmxid( dto.getPcmydntmxid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmYdntmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getYgw() != null ) {
            pcmYdntmx.setYgw( dto.getYgw() );
        }
        if ( dto.getShortname() != null ) {
            pcmYdntmx.setShortname( dto.getShortname() );
        }

        return pcmYdntmx;
    }

    @Override
    public PcmYdntmxDTO toDto(PcmYdntmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmYdntmxDTO pcmYdntmxDTO = new PcmYdntmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmYdntmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmYdntmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDistirbutionid() != null ) {
            pcmYdntmxDTO.setDistirbutionid( entity.getDistirbutionid() );
        }
        if ( entity.getPcmydntmxname() != null ) {
            pcmYdntmxDTO.setPcmydntmxname( entity.getPcmydntmxname() );
        }
        if ( entity.getJsrq() != null ) {
            pcmYdntmxDTO.setJsrq( entity.getJsrq() );
        }
        if ( entity.getBz() != null ) {
            pcmYdntmxDTO.setBz( entity.getBz() );
        }
        if ( entity.getCz() != null ) {
            pcmYdntmxDTO.setCz( entity.getCz() );
        }
        if ( entity.getReason() != null ) {
            pcmYdntmxDTO.setReason( entity.getReason() );
        }
        if ( entity.getIsfinished() != null ) {
            pcmYdntmxDTO.setIsfinished( entity.getIsfinished() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmYdntmxDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getSxrq() != null ) {
            pcmYdntmxDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getBmid() != null ) {
            pcmYdntmxDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getYzw() != null ) {
            pcmYdntmxDTO.setYzw( entity.getYzw() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmYdntmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pcmYdntmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmYdntmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getZzid() != null ) {
            pcmYdntmxDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getLxdh() != null ) {
            pcmYdntmxDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getZjhm() != null ) {
            pcmYdntmxDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getYgbh() != null ) {
            pcmYdntmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmYdntmxDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmYdntmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmYdntmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getZz() != null ) {
            pcmYdntmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmYdntmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getNl() != null ) {
            pcmYdntmxDTO.setNl( entity.getNl() );
        }
        if ( entity.getYrank() != null ) {
            pcmYdntmxDTO.setYrank( entity.getYrank() );
        }
        if ( entity.getBm() != null ) {
            pcmYdntmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getPcmydmxtype() != null ) {
            pcmYdntmxDTO.setPcmydmxtype( entity.getPcmydmxtype() );
        }
        if ( entity.getOrgid() != null ) {
            pcmYdntmxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getCsrq() != null ) {
            pcmYdntmxDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getPcmydntmxid() != null ) {
            pcmYdntmxDTO.setPcmydntmxid( entity.getPcmydntmxid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmYdntmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getYgw() != null ) {
            pcmYdntmxDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getShortname() != null ) {
            pcmYdntmxDTO.setShortname( entity.getShortname() );
        }

        return pcmYdntmxDTO;
    }

    @Override
    public List<PcmYdntmx> toDomain(List<PcmYdntmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmYdntmx> list = new ArrayList<PcmYdntmx>( dtoList.size() );
        for ( PcmYdntmxDTO pcmYdntmxDTO : dtoList ) {
            list.add( toDomain( pcmYdntmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmYdntmxDTO> toDto(List<PcmYdntmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmYdntmxDTO> list = new ArrayList<PcmYdntmxDTO>( entityList.size() );
        for ( PcmYdntmx pcmYdntmx : entityList ) {
            list.add( toDto( pcmYdntmx ) );
        }

        return list;
    }
}
