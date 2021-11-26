package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmJxsygzzsq;
import cn.ibizlab.ehr.webapi.dto.PcmJxsygzzsqDTO;
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
public class PcmJxsygzzsqMappingImpl implements PcmJxsygzzsqMapping {

    @Override
    public PcmJxsygzzsq toDomain(PcmJxsygzzsqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmJxsygzzsq pcmJxsygzzsq = new PcmJxsygzzsq();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmJxsygzzsq.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmJxsygzzsq.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getCzrq() != null ) {
            pcmJxsygzzsq.setCzrq( dto.getCzrq() );
        }
        if ( dto.getCzr() != null ) {
            pcmJxsygzzsq.setCzr( dto.getCzr() );
        }
        if ( dto.getIstemp() != null ) {
            pcmJxsygzzsq.setIstemp( dto.getIstemp() );
        }
        if ( dto.getBz() != null ) {
            pcmJxsygzzsq.setBz( dto.getBz() );
        }
        if ( dto.getCzrid() != null ) {
            pcmJxsygzzsq.setCzrid( dto.getCzrid() );
        }
        if ( dto.getPcmjxsygzzsqname() != null ) {
            pcmJxsygzzsq.setPcmjxsygzzsqname( dto.getPcmjxsygzzsqname() );
        }
        if ( dto.getSxrq() != null ) {
            pcmJxsygzzsq.setSxrq( dto.getSxrq() );
        }
        if ( dto.getZzlx() != null ) {
            pcmJxsygzzsq.setZzlx( dto.getZzlx() );
        }
        if ( dto.getOrgid() != null ) {
            pcmJxsygzzsq.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmJxsygzzsq.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmJxsygzzsq.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmJxsygzzsq.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmJxsygzzsq.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPcmjxsygzzsqid() != null ) {
            pcmJxsygzzsq.setPcmjxsygzzsqid( dto.getPcmjxsygzzsqid() );
        }

        return pcmJxsygzzsq;
    }

    @Override
    public PcmJxsygzzsqDTO toDto(PcmJxsygzzsq entity) {
        if ( entity == null ) {
            return null;
        }

        PcmJxsygzzsqDTO pcmJxsygzzsqDTO = new PcmJxsygzzsqDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmJxsygzzsqDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmJxsygzzsqDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getCzrq() != null ) {
            pcmJxsygzzsqDTO.setCzrq( entity.getCzrq() );
        }
        if ( entity.getCzr() != null ) {
            pcmJxsygzzsqDTO.setCzr( entity.getCzr() );
        }
        if ( entity.getIstemp() != null ) {
            pcmJxsygzzsqDTO.setIstemp( entity.getIstemp() );
        }
        if ( entity.getBz() != null ) {
            pcmJxsygzzsqDTO.setBz( entity.getBz() );
        }
        if ( entity.getCzrid() != null ) {
            pcmJxsygzzsqDTO.setCzrid( entity.getCzrid() );
        }
        if ( entity.getPcmjxsygzzsqname() != null ) {
            pcmJxsygzzsqDTO.setPcmjxsygzzsqname( entity.getPcmjxsygzzsqname() );
        }
        if ( entity.getSxrq() != null ) {
            pcmJxsygzzsqDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getZzlx() != null ) {
            pcmJxsygzzsqDTO.setZzlx( entity.getZzlx() );
        }
        if ( entity.getOrgid() != null ) {
            pcmJxsygzzsqDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmJxsygzzsqDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmJxsygzzsqDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmJxsygzzsqDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmJxsygzzsqDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPcmjxsygzzsqid() != null ) {
            pcmJxsygzzsqDTO.setPcmjxsygzzsqid( entity.getPcmjxsygzzsqid() );
        }

        return pcmJxsygzzsqDTO;
    }

    @Override
    public List<PcmJxsygzzsq> toDomain(List<PcmJxsygzzsqDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmJxsygzzsq> list = new ArrayList<PcmJxsygzzsq>( dtoList.size() );
        for ( PcmJxsygzzsqDTO pcmJxsygzzsqDTO : dtoList ) {
            list.add( toDomain( pcmJxsygzzsqDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmJxsygzzsqDTO> toDto(List<PcmJxsygzzsq> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmJxsygzzsqDTO> list = new ArrayList<PcmJxsygzzsqDTO>( entityList.size() );
        for ( PcmJxsygzzsq pcmJxsygzzsq : entityList ) {
            list.add( toDto( pcmJxsygzzsq ) );
        }

        return list;
    }
}
