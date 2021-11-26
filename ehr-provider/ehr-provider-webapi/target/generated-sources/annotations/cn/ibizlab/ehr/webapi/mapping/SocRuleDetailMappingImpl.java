package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.soc.domain.SocRuleDetail;
import cn.ibizlab.ehr.webapi.dto.SocRuleDetailDTO;
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
public class SocRuleDetailMappingImpl implements SocRuleDetailMapping {

    @Override
    public SocRuleDetail toDomain(SocRuleDetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SocRuleDetail socRuleDetail = new SocRuleDetail();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            socRuleDetail.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            socRuleDetail.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSocruledetailname() != null ) {
            socRuleDetail.setSocruledetailname( dto.getSocruledetailname() );
        }
        if ( dto.getSoctypeid() != null ) {
            socRuleDetail.setSoctypeid( dto.getSoctypeid() );
        }
        if ( dto.getSocruleid() != null ) {
            socRuleDetail.setSocruleid( dto.getSocruleid() );
        }
        if ( dto.getHighnum() != null ) {
            socRuleDetail.setHighnum( dto.getHighnum() );
        }
        if ( dto.getLownum() != null ) {
            socRuleDetail.setLownum( dto.getLownum() );
        }
        if ( dto.getCompanynum() != null ) {
            socRuleDetail.setCompanynum( dto.getCompanynum() );
        }
        if ( dto.getPersonnum() != null ) {
            socRuleDetail.setPersonnum( dto.getPersonnum() );
        }
        if ( dto.getCompanyrate() != null ) {
            socRuleDetail.setCompanyrate( dto.getCompanyrate() );
        }
        if ( dto.getPersonrate() != null ) {
            socRuleDetail.setPersonrate( dto.getPersonrate() );
        }
        if ( dto.getPersonamount() != null ) {
            socRuleDetail.setPersonamount( dto.getPersonamount() );
        }
        if ( dto.getCompanyamount() != null ) {
            socRuleDetail.setCompanyamount( dto.getCompanyamount() );
        }
        if ( dto.getMemo() != null ) {
            socRuleDetail.setMemo( dto.getMemo() );
        }
        if ( dto.getSocruledetailid() != null ) {
            socRuleDetail.setSocruledetailid( dto.getSocruledetailid() );
        }
        if ( dto.getCreateman() != null ) {
            socRuleDetail.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            socRuleDetail.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            socRuleDetail.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            socRuleDetail.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getSoctypename() != null ) {
            socRuleDetail.setSoctypename( dto.getSoctypename() );
        }
        if ( dto.getSocrulename() != null ) {
            socRuleDetail.setSocrulename( dto.getSocrulename() );
        }
        if ( dto.getOrdervalue() != null ) {
            socRuleDetail.setOrdervalue( dto.getOrdervalue() );
        }

        return socRuleDetail;
    }

    @Override
    public SocRuleDetailDTO toDto(SocRuleDetail entity) {
        if ( entity == null ) {
            return null;
        }

        SocRuleDetailDTO socRuleDetailDTO = new SocRuleDetailDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            socRuleDetailDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            socRuleDetailDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSocruledetailname() != null ) {
            socRuleDetailDTO.setSocruledetailname( entity.getSocruledetailname() );
        }
        if ( entity.getSoctypeid() != null ) {
            socRuleDetailDTO.setSoctypeid( entity.getSoctypeid() );
        }
        if ( entity.getSocruleid() != null ) {
            socRuleDetailDTO.setSocruleid( entity.getSocruleid() );
        }
        if ( entity.getHighnum() != null ) {
            socRuleDetailDTO.setHighnum( entity.getHighnum() );
        }
        if ( entity.getLownum() != null ) {
            socRuleDetailDTO.setLownum( entity.getLownum() );
        }
        if ( entity.getCompanynum() != null ) {
            socRuleDetailDTO.setCompanynum( entity.getCompanynum() );
        }
        if ( entity.getPersonnum() != null ) {
            socRuleDetailDTO.setPersonnum( entity.getPersonnum() );
        }
        if ( entity.getCompanyrate() != null ) {
            socRuleDetailDTO.setCompanyrate( entity.getCompanyrate() );
        }
        if ( entity.getPersonrate() != null ) {
            socRuleDetailDTO.setPersonrate( entity.getPersonrate() );
        }
        if ( entity.getPersonamount() != null ) {
            socRuleDetailDTO.setPersonamount( entity.getPersonamount() );
        }
        if ( entity.getCompanyamount() != null ) {
            socRuleDetailDTO.setCompanyamount( entity.getCompanyamount() );
        }
        if ( entity.getMemo() != null ) {
            socRuleDetailDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getSocruledetailid() != null ) {
            socRuleDetailDTO.setSocruledetailid( entity.getSocruledetailid() );
        }
        if ( entity.getCreateman() != null ) {
            socRuleDetailDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            socRuleDetailDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            socRuleDetailDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            socRuleDetailDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getSoctypename() != null ) {
            socRuleDetailDTO.setSoctypename( entity.getSoctypename() );
        }
        if ( entity.getSocrulename() != null ) {
            socRuleDetailDTO.setSocrulename( entity.getSocrulename() );
        }
        if ( entity.getOrdervalue() != null ) {
            socRuleDetailDTO.setOrdervalue( entity.getOrdervalue() );
        }

        return socRuleDetailDTO;
    }

    @Override
    public List<SocRuleDetail> toDomain(List<SocRuleDetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SocRuleDetail> list = new ArrayList<SocRuleDetail>( dtoList.size() );
        for ( SocRuleDetailDTO socRuleDetailDTO : dtoList ) {
            list.add( toDomain( socRuleDetailDTO ) );
        }

        return list;
    }

    @Override
    public List<SocRuleDetailDTO> toDto(List<SocRuleDetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SocRuleDetailDTO> list = new ArrayList<SocRuleDetailDTO>( entityList.size() );
        for ( SocRuleDetail socRuleDetail : entityList ) {
            list.add( toDto( socRuleDetail ) );
        }

        return list;
    }
}
