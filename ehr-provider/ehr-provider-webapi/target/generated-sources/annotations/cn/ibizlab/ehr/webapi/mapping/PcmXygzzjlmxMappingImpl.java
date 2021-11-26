package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmXygzzjlmx;
import cn.ibizlab.ehr.webapi.dto.PcmXygzzjlmxDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmXygzzjlmxMappingImpl implements PcmXygzzjlmxMapping {

    @Override
    public PcmXygzzjlmx toDomain(PcmXygzzjlmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmXygzzjlmx pcmXygzzjlmx = new PcmXygzzjlmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmXygzzjlmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmXygzzjlmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPcmxygzzjlmxname() != null ) {
            pcmXygzzjlmx.setPcmxygzzjlmxname( dto.getPcmxygzzjlmxname() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmXygzzjlmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getZzsj() != null ) {
            pcmXygzzjlmx.setZzsj( dto.getZzsj() );
        }
        if ( dto.getFinished() != null ) {
            pcmXygzzjlmx.setFinished( dto.getFinished() );
        }
        if ( dto.getIstemp() != null ) {
            pcmXygzzjlmx.setIstemp( dto.getIstemp() );
        }
        if ( dto.getRzqd() != null ) {
            pcmXygzzjlmx.setRzqd( dto.getRzqd() );
        }
        if ( dto.getBm() != null ) {
            pcmXygzzjlmx.setBm( dto.getBm() );
        }
        if ( dto.getDuration() != null ) {
            pcmXygzzjlmx.setDuration( dto.getDuration() );
        }
        if ( dto.getFs() != null ) {
            pcmXygzzjlmx.setFs( dto.getFs() );
        }
        if ( dto.getYgbh() != null ) {
            pcmXygzzjlmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getZz() != null ) {
            pcmXygzzjlmx.setZz( dto.getZz() );
        }
        if ( dto.getZzgw() != null ) {
            pcmXygzzjlmx.setZzgw( dto.getZzgw() );
        }
        if ( dto.getZzid() != null ) {
            pcmXygzzjlmx.setZzid( dto.getZzid() );
        }
        if ( dto.getPj() != null ) {
            pcmXygzzjlmx.setPj( dto.getPj() );
        }
        if ( dto.getBmid() != null ) {
            pcmXygzzjlmx.setBmid( dto.getBmid() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmXygzzjlmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPcmxygzzsqid() != null ) {
            pcmXygzzjlmx.setPcmxygzzsqid( dto.getPcmxygzzsqid() );
        }
        if ( dto.getPcmxygzzkhjgjlid() != null ) {
            pcmXygzzjlmx.setPcmxygzzkhjgjlid( dto.getPcmxygzzkhjgjlid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmXygzzjlmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrgid() != null ) {
            pcmXygzzjlmx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmXygzzjlmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmXygzzjlmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPcmxygzzjlmxid() != null ) {
            pcmXygzzjlmx.setPcmxygzzjlmxid( dto.getPcmxygzzjlmxid() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmXygzzjlmx.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmXygzzjlmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getJssj() != null ) {
            pcmXygzzjlmx.setJssj( dto.getJssj() );
        }
        if ( dto.getPcmxygzzkhjgjlname() != null ) {
            pcmXygzzjlmx.setPcmxygzzkhjgjlname( dto.getPcmxygzzkhjgjlname() );
        }
        if ( dto.getPcmxygzzsqname() != null ) {
            pcmXygzzjlmx.setPcmxygzzsqname( dto.getPcmxygzzsqname() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmXygzzjlmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getQssj() != null ) {
            pcmXygzzjlmx.setQssj( dto.getQssj() );
        }

        return pcmXygzzjlmx;
    }

    @Override
    public PcmXygzzjlmxDTO toDto(PcmXygzzjlmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmXygzzjlmxDTO pcmXygzzjlmxDTO = new PcmXygzzjlmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmXygzzjlmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmXygzzjlmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPcmxygzzjlmxname() != null ) {
            pcmXygzzjlmxDTO.setPcmxygzzjlmxname( entity.getPcmxygzzjlmxname() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmXygzzjlmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getZzsj() != null ) {
            pcmXygzzjlmxDTO.setZzsj( entity.getZzsj() );
        }
        if ( entity.getFinished() != null ) {
            pcmXygzzjlmxDTO.setFinished( entity.getFinished() );
        }
        if ( entity.getIstemp() != null ) {
            pcmXygzzjlmxDTO.setIstemp( entity.getIstemp() );
        }
        if ( entity.getRzqd() != null ) {
            pcmXygzzjlmxDTO.setRzqd( entity.getRzqd() );
        }
        if ( entity.getBm() != null ) {
            pcmXygzzjlmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getDuration() != null ) {
            pcmXygzzjlmxDTO.setDuration( entity.getDuration() );
        }
        if ( entity.getFs() != null ) {
            pcmXygzzjlmxDTO.setFs( entity.getFs() );
        }
        if ( entity.getYgbh() != null ) {
            pcmXygzzjlmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getZz() != null ) {
            pcmXygzzjlmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getZzgw() != null ) {
            pcmXygzzjlmxDTO.setZzgw( entity.getZzgw() );
        }
        if ( entity.getZzid() != null ) {
            pcmXygzzjlmxDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getPj() != null ) {
            pcmXygzzjlmxDTO.setPj( entity.getPj() );
        }
        if ( entity.getBmid() != null ) {
            pcmXygzzjlmxDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmXygzzjlmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPcmxygzzsqid() != null ) {
            pcmXygzzjlmxDTO.setPcmxygzzsqid( entity.getPcmxygzzsqid() );
        }
        if ( entity.getPcmxygzzkhjgjlid() != null ) {
            pcmXygzzjlmxDTO.setPcmxygzzkhjgjlid( entity.getPcmxygzzkhjgjlid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmXygzzjlmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrgid() != null ) {
            pcmXygzzjlmxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmXygzzjlmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmXygzzjlmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPcmxygzzjlmxid() != null ) {
            pcmXygzzjlmxDTO.setPcmxygzzjlmxid( entity.getPcmxygzzjlmxid() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmXygzzjlmxDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmXygzzjlmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getJssj() != null ) {
            pcmXygzzjlmxDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getPcmxygzzkhjgjlname() != null ) {
            pcmXygzzjlmxDTO.setPcmxygzzkhjgjlname( entity.getPcmxygzzkhjgjlname() );
        }
        if ( entity.getPcmxygzzsqname() != null ) {
            pcmXygzzjlmxDTO.setPcmxygzzsqname( entity.getPcmxygzzsqname() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmXygzzjlmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getQssj() != null ) {
            pcmXygzzjlmxDTO.setQssj( entity.getQssj() );
        }

        return pcmXygzzjlmxDTO;
    }

    @Override
    public List<PcmXygzzjlmx> toDomain(List<PcmXygzzjlmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmXygzzjlmx> list = new ArrayList<PcmXygzzjlmx>( dtoList.size() );
        for ( PcmXygzzjlmxDTO pcmXygzzjlmxDTO : dtoList ) {
            list.add( toDomain( pcmXygzzjlmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmXygzzjlmxDTO> toDto(List<PcmXygzzjlmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmXygzzjlmxDTO> list = new ArrayList<PcmXygzzjlmxDTO>( entityList.size() );
        for ( PcmXygzzjlmx pcmXygzzjlmx : entityList ) {
            list.add( toDto( pcmXygzzjlmx ) );
        }

        return list;
    }
}
