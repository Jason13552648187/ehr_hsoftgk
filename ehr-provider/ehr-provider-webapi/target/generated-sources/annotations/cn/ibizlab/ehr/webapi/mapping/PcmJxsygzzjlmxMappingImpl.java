package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmJxsygzzjlmx;
import cn.ibizlab.ehr.webapi.dto.PcmJxsygzzjlmxDTO;
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
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmJxsygzzjlmxMappingImpl implements PcmJxsygzzjlmxMapping {

    @Override
    public PcmJxsygzzjlmx toDomain(PcmJxsygzzjlmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmJxsygzzjlmx pcmJxsygzzjlmx = new PcmJxsygzzjlmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmJxsygzzjlmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmJxsygzzjlmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getFinished() != null ) {
            pcmJxsygzzjlmx.setFinished( dto.getFinished() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmJxsygzzjlmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getIstemp() != null ) {
            pcmJxsygzzjlmx.setIstemp( dto.getIstemp() );
        }
        if ( dto.getPcmjxsygzzjlmxname() != null ) {
            pcmJxsygzzjlmx.setPcmjxsygzzjlmxname( dto.getPcmjxsygzzjlmxname() );
        }
        if ( dto.getBmid() != null ) {
            pcmJxsygzzjlmx.setBmid( dto.getBmid() );
        }
        if ( dto.getRzqd() != null ) {
            pcmJxsygzzjlmx.setRzqd( dto.getRzqd() );
        }
        if ( dto.getDuration() != null ) {
            pcmJxsygzzjlmx.setDuration( dto.getDuration() );
        }
        if ( dto.getZz() != null ) {
            pcmJxsygzzjlmx.setZz( dto.getZz() );
        }
        if ( dto.getBm() != null ) {
            pcmJxsygzzjlmx.setBm( dto.getBm() );
        }
        if ( dto.getZzid() != null ) {
            pcmJxsygzzjlmx.setZzid( dto.getZzid() );
        }
        if ( dto.getFs() != null ) {
            pcmJxsygzzjlmx.setFs( dto.getFs() );
        }
        if ( dto.getPj() != null ) {
            pcmJxsygzzjlmx.setPj( dto.getPj() );
        }
        if ( dto.getZzgw() != null ) {
            pcmJxsygzzjlmx.setZzgw( dto.getZzgw() );
        }
        if ( dto.getPcmjxsygzzsqid() != null ) {
            pcmJxsygzzjlmx.setPcmjxsygzzsqid( dto.getPcmjxsygzzsqid() );
        }
        if ( dto.getPcmjxszzkhjgjlid() != null ) {
            pcmJxsygzzjlmx.setPcmjxszzkhjgjlid( dto.getPcmjxszzkhjgjlid() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmJxsygzzjlmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmJxsygzzjlmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmJxsygzzjlmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmJxsygzzjlmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrgid() != null ) {
            pcmJxsygzzjlmx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getPcmjxsygzzjlmxid() != null ) {
            pcmJxsygzzjlmx.setPcmjxsygzzjlmxid( dto.getPcmjxsygzzjlmxid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmJxsygzzjlmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmJxsygzzjlmx.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmJxsygzzjlmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getJssj() != null ) {
            pcmJxsygzzjlmx.setJssj( dto.getJssj() );
        }
        if ( dto.getYgbh() != null ) {
            pcmJxsygzzjlmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getQssj() != null ) {
            pcmJxsygzzjlmx.setQssj( dto.getQssj() );
        }
        if ( dto.getPcmjxsygzzsqname() != null ) {
            pcmJxsygzzjlmx.setPcmjxsygzzsqname( dto.getPcmjxsygzzsqname() );
        }
        if ( dto.getPcmjxszzkhjgjlname() != null ) {
            pcmJxsygzzjlmx.setPcmjxszzkhjgjlname( dto.getPcmjxszzkhjgjlname() );
        }

        return pcmJxsygzzjlmx;
    }

    @Override
    public PcmJxsygzzjlmxDTO toDto(PcmJxsygzzjlmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmJxsygzzjlmxDTO pcmJxsygzzjlmxDTO = new PcmJxsygzzjlmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmJxsygzzjlmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmJxsygzzjlmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getFinished() != null ) {
            pcmJxsygzzjlmxDTO.setFinished( entity.getFinished() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmJxsygzzjlmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getIstemp() != null ) {
            pcmJxsygzzjlmxDTO.setIstemp( entity.getIstemp() );
        }
        if ( entity.getPcmjxsygzzjlmxname() != null ) {
            pcmJxsygzzjlmxDTO.setPcmjxsygzzjlmxname( entity.getPcmjxsygzzjlmxname() );
        }
        if ( entity.getBmid() != null ) {
            pcmJxsygzzjlmxDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getRzqd() != null ) {
            pcmJxsygzzjlmxDTO.setRzqd( entity.getRzqd() );
        }
        if ( entity.getDuration() != null ) {
            pcmJxsygzzjlmxDTO.setDuration( entity.getDuration() );
        }
        if ( entity.getZz() != null ) {
            pcmJxsygzzjlmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getBm() != null ) {
            pcmJxsygzzjlmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getZzid() != null ) {
            pcmJxsygzzjlmxDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getFs() != null ) {
            pcmJxsygzzjlmxDTO.setFs( entity.getFs() );
        }
        if ( entity.getPj() != null ) {
            pcmJxsygzzjlmxDTO.setPj( entity.getPj() );
        }
        if ( entity.getZzgw() != null ) {
            pcmJxsygzzjlmxDTO.setZzgw( entity.getZzgw() );
        }
        if ( entity.getPcmjxsygzzsqid() != null ) {
            pcmJxsygzzjlmxDTO.setPcmjxsygzzsqid( entity.getPcmjxsygzzsqid() );
        }
        if ( entity.getPcmjxszzkhjgjlid() != null ) {
            pcmJxsygzzjlmxDTO.setPcmjxszzkhjgjlid( entity.getPcmjxszzkhjgjlid() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmJxsygzzjlmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmJxsygzzjlmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmJxsygzzjlmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmJxsygzzjlmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrgid() != null ) {
            pcmJxsygzzjlmxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getPcmjxsygzzjlmxid() != null ) {
            pcmJxsygzzjlmxDTO.setPcmjxsygzzjlmxid( entity.getPcmjxsygzzjlmxid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmJxsygzzjlmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmJxsygzzjlmxDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmJxsygzzjlmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getJssj() != null ) {
            pcmJxsygzzjlmxDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getYgbh() != null ) {
            pcmJxsygzzjlmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getQssj() != null ) {
            pcmJxsygzzjlmxDTO.setQssj( entity.getQssj() );
        }
        if ( entity.getPcmjxsygzzsqname() != null ) {
            pcmJxsygzzjlmxDTO.setPcmjxsygzzsqname( entity.getPcmjxsygzzsqname() );
        }
        if ( entity.getPcmjxszzkhjgjlname() != null ) {
            pcmJxsygzzjlmxDTO.setPcmjxszzkhjgjlname( entity.getPcmjxszzkhjgjlname() );
        }

        return pcmJxsygzzjlmxDTO;
    }

    @Override
    public List<PcmJxsygzzjlmx> toDomain(List<PcmJxsygzzjlmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmJxsygzzjlmx> list = new ArrayList<PcmJxsygzzjlmx>( dtoList.size() );
        for ( PcmJxsygzzjlmxDTO pcmJxsygzzjlmxDTO : dtoList ) {
            list.add( toDomain( pcmJxsygzzjlmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmJxsygzzjlmxDTO> toDto(List<PcmJxsygzzjlmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmJxsygzzjlmxDTO> list = new ArrayList<PcmJxsygzzjlmxDTO>( entityList.size() );
        for ( PcmJxsygzzjlmx pcmJxsygzzjlmx : entityList ) {
            list.add( toDto( pcmJxsygzzjlmx ) );
        }

        return list;
    }
}
