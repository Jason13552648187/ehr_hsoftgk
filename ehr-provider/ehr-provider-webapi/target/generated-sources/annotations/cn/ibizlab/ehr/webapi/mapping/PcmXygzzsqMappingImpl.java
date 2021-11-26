package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmXygzzsq;
import cn.ibizlab.ehr.webapi.dto.PcmXygzzsqDTO;
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
public class PcmXygzzsqMappingImpl implements PcmXygzzsqMapping {

    @Override
    public PcmXygzzsq toDomain(PcmXygzzsqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmXygzzsq pcmXygzzsq = new PcmXygzzsq();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmXygzzsq.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmXygzzsq.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getIstemp() != null ) {
            pcmXygzzsq.setIstemp( dto.getIstemp() );
        }
        if ( dto.getCzr() != null ) {
            pcmXygzzsq.setCzr( dto.getCzr() );
        }
        if ( dto.getSxrq() != null ) {
            pcmXygzzsq.setSxrq( dto.getSxrq() );
        }
        if ( dto.getPcmxygzzsqname() != null ) {
            pcmXygzzsq.setPcmxygzzsqname( dto.getPcmxygzzsqname() );
        }
        if ( dto.getBz() != null ) {
            pcmXygzzsq.setBz( dto.getBz() );
        }
        if ( dto.getZzlx() != null ) {
            pcmXygzzsq.setZzlx( dto.getZzlx() );
        }
        if ( dto.getCzrq() != null ) {
            pcmXygzzsq.setCzrq( dto.getCzrq() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmXygzzsq.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrgid() != null ) {
            pcmXygzzsq.setOrgid( dto.getOrgid() );
        }
        if ( dto.getPcmxygzzsqid() != null ) {
            pcmXygzzsq.setPcmxygzzsqid( dto.getPcmxygzzsqid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmXygzzsq.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmXygzzsq.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmXygzzsq.setCreatedate( dto.getCreatedate() );
        }

        return pcmXygzzsq;
    }

    @Override
    public PcmXygzzsqDTO toDto(PcmXygzzsq entity) {
        if ( entity == null ) {
            return null;
        }

        PcmXygzzsqDTO pcmXygzzsqDTO = new PcmXygzzsqDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmXygzzsqDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmXygzzsqDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getIstemp() != null ) {
            pcmXygzzsqDTO.setIstemp( entity.getIstemp() );
        }
        if ( entity.getCzr() != null ) {
            pcmXygzzsqDTO.setCzr( entity.getCzr() );
        }
        if ( entity.getSxrq() != null ) {
            pcmXygzzsqDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getPcmxygzzsqname() != null ) {
            pcmXygzzsqDTO.setPcmxygzzsqname( entity.getPcmxygzzsqname() );
        }
        if ( entity.getBz() != null ) {
            pcmXygzzsqDTO.setBz( entity.getBz() );
        }
        if ( entity.getZzlx() != null ) {
            pcmXygzzsqDTO.setZzlx( entity.getZzlx() );
        }
        if ( entity.getCzrq() != null ) {
            pcmXygzzsqDTO.setCzrq( entity.getCzrq() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmXygzzsqDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrgid() != null ) {
            pcmXygzzsqDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getPcmxygzzsqid() != null ) {
            pcmXygzzsqDTO.setPcmxygzzsqid( entity.getPcmxygzzsqid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmXygzzsqDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmXygzzsqDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmXygzzsqDTO.setCreatedate( entity.getCreatedate() );
        }

        return pcmXygzzsqDTO;
    }

    @Override
    public List<PcmXygzzsq> toDomain(List<PcmXygzzsqDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmXygzzsq> list = new ArrayList<PcmXygzzsq>( dtoList.size() );
        for ( PcmXygzzsqDTO pcmXygzzsqDTO : dtoList ) {
            list.add( toDomain( pcmXygzzsqDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmXygzzsqDTO> toDto(List<PcmXygzzsq> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmXygzzsqDTO> list = new ArrayList<PcmXygzzsqDTO>( entityList.size() );
        for ( PcmXygzzsq pcmXygzzsq : entityList ) {
            list.add( toDto( pcmXygzzsq ) );
        }

        return list;
    }
}
